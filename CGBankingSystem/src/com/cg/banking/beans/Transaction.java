package com.cg.banking.beans;

public class Transaction {
	private int transactionId;
	private float amount;
	private String transactionType;
	private long accountInit;
	private long accountFinal;
	
	public Transaction() {	}
	
	public Transaction(float amount, String transactionType) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
	}

	public Transaction(int transactionId, float amount, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.transactionType = transactionType;
	}
	
	public Transaction(float amount, String transactionType, long accountInit, long accountFinal) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
		this.accountInit = accountInit;
		this.accountFinal = accountFinal;
	}
	
	public Transaction(float amount, String transactionType, long accountInit) {
		super();
		this.amount = amount;
		this.transactionType = transactionType;
		this.accountInit = accountInit;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	public long getAccountInit() {
		return accountInit;
	}

	public void setAccountInit(long accountInit) {
		this.accountInit = accountInit;
	}

	public long getAccountFinal() {
		return accountFinal;
	}

	public void setAccountFinal(long accountFinal) {
		this.accountFinal = accountFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + transactionId;
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "***********************TRANSACTION DETAILS*********************"
				+ "\nTransaction Id = " + transactionId + "\nAmount = " + amount + "\nTransaction Type = "
				+ transactionType + "\nTransaction Id = " + getTransactionId() + "Amount = " + getAmount()
				+ "\nTransaction Type = " + getTransactionType() ;
	}
}
