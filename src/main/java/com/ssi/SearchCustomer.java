package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchCustomer {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Customer customer=session.get(Customer.class, "C111");
		
		System.out.println(customer.getCode());
		System.out.println(customer.getCname());
		System.out.println(customer.getAddress());
		List<Card> cards=customer.getCards();
		for(Card card:cards){
			System.out.println(card.getCardNo()+","+card.getCtype());
		
		}
		
		
		session.close();
		

	}

}
