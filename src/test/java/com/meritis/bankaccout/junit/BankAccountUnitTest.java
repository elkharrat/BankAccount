package com.meritis.bankaccout.junit;

import org.junit.Before;
import org.junit.Test;

import com.meritis.bankaccount.dao.TransactionDao;
import com.meritis.bankaccount.domain.Account;
import com.meritis.bankaccount.domain.Statement;

public class BankAccountUnitTest {

	private Account account;
	
	@Before
	public void setUp() {
		Statement statement = new Statement();
		TransactionDao transactionDao = new TransactionDao();
		this.account = new Account(transactionDao, statement);
	}
	@Test
	public void deposit_100() {
		this.account.deposit(100);
		this.account.printStatement();
		System.out.println();
	}
	@Test
	public void withraw_100() {
		this.account.withraw(100);
		this.account.printStatement();
		System.out.println();
	}
	@Test
	public void print_statement() {
		this.account.deposit(100);
		this.account.deposit(350);
		this.account.withraw(150);
		this.account.deposit(400);
		this.account.withraw(200);
		
		this.account.printStatement();
		System.out.println();
	}
}
