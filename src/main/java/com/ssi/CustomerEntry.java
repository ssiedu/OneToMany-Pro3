package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerEntry {

	public static void main(String[] args) {

		Customer c1=new Customer("C111","AAA","Indore");
		Customer c2=new Customer("C112","BBB","Bhopal");
		Customer c3=new Customer("C113","CCC","Delhi");
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1); session.save(c2); session.save(c3);
		tr.commit();
		session.close();
		
		System.out.println("CUSTOMERS DATA STORED SUCCESSFULLY");
		

	}

}
