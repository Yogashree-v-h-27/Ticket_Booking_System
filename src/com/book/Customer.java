package com.book;

import java.util.ArrayList;
import java.util.List;


public class Customer extends Ticket   {
 static String customerId;
 static String name;
 static String address;
List<Ticket> tickets=new ArrayList<Ticket>();
Ticket t=new Ticket(from_P, to_P, amt, date);
public Customer(String customerId, String name, String address) {
	super(from_P, to_P, amt, date);
	this.customerId = customerId;
	this.name = name;
	this.address = address;
	
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<Ticket> getTickets() {
	return tickets;
}
public void setTickets(List<Ticket> tickets) {
	this.tickets = tickets;
	
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result
			+ ((customerId == null) ? 0 : customerId.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (customerId == null) {
		if (other.customerId != null)
			return false;
	} else if (!customerId.equals(other.customerId))
		return false;
	return true;
}
} 