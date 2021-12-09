package com.meritis.bankaccount.domain;

import com.meritis.bankaccount.dao.TransactionDao;

public class Account {
	//private int amount;
	private TransactionDao transactionDao;
	private Statement statement;
	
	
	public Account(TransactionDao transactionDao, Statement statement) {
		super();
		this.transactionDao = transactionDao;
		this.statement = statement;
	}


	public void deposit(int amount) {
		this.transactionDao.deposit(amount);
	}
	
	public void withraw(int amount) {
		this.transactionDao.withraw(amount);
	}
	
	public void printStatement() {
		this.statement.print(this.transactionDao.getAllTransaction());
	}
}
