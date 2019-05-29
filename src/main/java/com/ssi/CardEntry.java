package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class CardEntry {

	public static void main(String[] args) {

		Card c1=new Card("1234","Gold",50000,new Customer("C111"));
		Card c2=new Card("2345","Silver",70000,new Customer("C111"));
		Card c3=new Card("3456","Silver",80000,new Customer("C111"));
		Card c4=new Card("4567","Platinum",150000,new Customer("C112"));
		Card c5=new Card("5678","Platinum",250000,new Customer("C112"));
		Card c6=new Card("6789","Reward",560000,new Customer("C113"));
		
		Session session=DataUtility.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(c1); session.save(c2); session.save(c3);
		session.save(c4); session.save(c5); session.save(c6);
		tr.commit();
		session.close();
		System.out.println("CARDS STORED SUCCESSFULLY");
		
		
	}

}
