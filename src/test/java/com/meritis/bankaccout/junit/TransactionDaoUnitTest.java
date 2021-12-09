package com.meritis.bankaccout.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.meritis.bankaccount.dao.TransactionDao;

public class TransactionDaoUnitTest {

	private TransactionDao transactionDao;
	
	@Before
	public void setUp() {
		this.transactionDao = new TransactionDao();
	}
	@Test
	public void add_deposit_transaction() {
		this.transactionDao.deposit(100);
		this.transactionDao.deposit(200);
		//assertEquals(1, this.transactionDao.getAllTransaction().size());
		assertEquals(2, this.transactionDao.getAllTransaction().size());
	}
	@Test
	public void add_withraw_transaction() {
		this.transactionDao.withraw(100);
		this.transactionDao.withraw(50);
		//assertEquals(1, this.transactionDao.getAllTransaction().size());
		assertEquals(2, this.transactionDao.getAllTransaction().size());
	}
}
