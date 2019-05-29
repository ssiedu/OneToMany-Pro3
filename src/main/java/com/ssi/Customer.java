package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private String code;
	private String cname;
	private String address;
	@OneToMany(mappedBy="customer")
	private List<Card> cards=new ArrayList<Card>();
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public Customer(String code, String cname, String address) {
		super();
		this.code = code;
		this.cname = cname;
		this.address = address;
	}
	public Customer(String code) {
		super();
		this.code = code;
	}
	public Customer() {
		super();
	}
	
	
	
	
	
}
