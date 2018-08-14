package com.revature.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	@Value("John Smith")
	private String name;
	
	@Value("100000")
	private int id;
	
	@Autowired
	private CheckingAccount chkacct;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setChkacct(CheckingAccount chkacct) {
		this.chkacct = chkacct;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", balance=$ " + chkacct.getBalance() + "]";
	}
	
	@PostConstruct
	public void initBalance() {
		chkacct.setBalance(0);
	}
	
	@PreDestroy
	public void closeAccount() {
		System.out.println("Account is now closed.");
		System.out.println("Closing balance is $" + chkacct.getBalance());
	}

}
