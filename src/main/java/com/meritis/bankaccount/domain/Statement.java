package com.meritis.bankaccount.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Statement {

	private final String ENTETE = "(Operation == Date == Amount == Balance)";
	
	public void print(List<Transaction> allTransactions) {
		System.out.println(ENTETE);
		AtomicInteger balance = new AtomicInteger(0);
		List<String> transactionLine= allTransactions.stream().
				map(tr->mapperTransactionToLine(tr, balance)).
				collect(Collectors.toCollection(ArrayList::new));
		
		transactionLine.stream().forEach(System.out::println);
	}
	
	private String mapperTransactionToLine(Transaction transaction, AtomicInteger balance) {
		
		return "("+
		transaction.getOperation()+
		" == "+
		transaction.getTransactionDate()+
		" == "+
		transaction.getAmount()+
		" == "+
		balance.addAndGet(transaction.getAmount())+
		")";
	}
}
