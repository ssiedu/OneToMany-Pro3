package com.ssi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Card {
	@Id
	private String cardNo;
	private String ctype;
	@Column(name="climit")
	private int limit;
	
	@ManyToOne
	private Customer customer;
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public Card(String cardNo, String ctype, int limit) {
		super();
		this.cardNo = cardNo;
		this.ctype = ctype;
		this.limit = limit;
	}
	public Card(String cardNo) {
		super();
		this.cardNo = cardNo;
	}
	public Card() {
		super();
	}
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", ctype=" + ctype + ", limit="
				+ limit + "]";
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Card(String cardNo, String ctype, int limit, Customer customer) {
		super();
		this.cardNo = cardNo;
		this.ctype = ctype;
		this.limit = limit;
		this.customer = customer;
	}
	
	
}
