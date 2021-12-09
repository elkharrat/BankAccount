package com.meritis.bankaccount.dao;

import java.util.ArrayList;
import java.util.List;

import com.meritis.bankaccount.domain.Transaction;

public class TransactionDao {

	private List<Transaction> allTransaction;
	private final String DEPOSIT = "DEPOSIT";
	private final String WITHRAW = "WITHRAW";

	public TransactionDao() {
		super();
		this.allTransaction = new ArrayList<Transaction>();
	}
	
	public void deposit(int amount) {
		this.allTransaction.add(new Transaction(amount,DEPOSIT));
	}
	
	public void withraw(int amount) {
		this.allTransaction.add(new Transaction(-amount,WITHRAW));
	}
	
	public List<Transaction> getAllTransaction() {
		return allTransaction;
	}

	public void setAllTransaction(List<Transaction> allTransaction) {
		this.allTransaction = allTransaction;
	}
	
	
}
