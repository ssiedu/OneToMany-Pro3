package com.ssi;

import org.hibernate.Session;

public class SearchCard {

	public static void main(String[] args) {

		Session session=DataUtility.getSF().openSession();
		Card card=session.get(Card.class, "5678");
		System.out.println(card.getCardNo());
		System.out.println(card.getCtype());
		System.out.println(card.getLimit());
		System.out.println(card.getCustomer().getCode());
		System.out.println(card.getCustomer().getCname());
		System.out.println(card.getCustomer().getAddress());
		session.close();

	}

}
