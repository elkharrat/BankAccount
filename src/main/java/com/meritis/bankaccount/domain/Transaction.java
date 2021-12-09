package com.meritis.bankaccount.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	
	private int amount;
	private String operation;
	private String transactionDate;
	
	public Transaction(int amount, String operation) {
		super();
		this.amount = amount;
		this.operation = operation;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.transactionDate = sdf.format(new Date());
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	
	
	
}
