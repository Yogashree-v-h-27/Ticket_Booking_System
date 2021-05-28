package com.book;

public class Ticket {
	 static String from_P;
	  static String to_P;
	  static int amt;
	  static String date;
	public Ticket(String from_P, String to_P, int amt, String date) {
		super();
		this.from_P = from_P;
		this.to_P = to_P;
		this.amt = amt;
		this.date = date;
	}
	
	public String getFrom_P() {
		return from_P;
	}
	public void setFrom_P(String from_P) {
		this.from_P = from_P;
	}
	public String getTo_P() {
		return to_P;
	}
	public void setTo_P(String to_P) {
		this.to_P = to_P;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
