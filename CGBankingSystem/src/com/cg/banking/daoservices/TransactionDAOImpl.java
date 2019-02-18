package com.cg.banking.daoservices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cg.banking.beans.Transaction;
import com.cg.banking.util.BankingDBUtil;

public class TransactionDAOImpl implements TransactionDAO{
	
	private static Connection con = BankingDBUtil.getDBConnection();

	@Override
	public Transaction save(Transaction transaction) {
		try {
			con.setAutoCommit(false);

			PreparedStatement pstmt1 = con.prepareStatement("insert into Transactions(transactionId,transactionType,accountInit,accountFinal,amount) values(TRANSACTION_ID_SEQ,?,?,?,?)");
			pstmt1.setString(1, transaction.getTransactionType());
			pstmt1.setString(2, transaction.getAccountType());
			pstmt1.setString(3, transaction.getAccountStatus());
			pstmt1.setFloat(4, transaction.getAmount());
			pstmt1.executeUpdate();

			PreparedStatement pstmt2  = con.prepareStatement("select max(transactionId) from Transactions");
			ResultSet rs = pstmt2.executeQuery();
			rs.next();
			int transactionId = rs.getInt(1);
			
			transaction.setTransactionId(transactionId);

			con.commit();
		}catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return transaction;
	}

	@Override
	public boolean update(Transaction transaction) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Transaction findOne(int transactionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
