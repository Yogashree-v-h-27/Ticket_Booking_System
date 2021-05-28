package com.book;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.logging.Logger;

public class Test extends Customer {
	Map<String,Customer> map=new HashMap<String,Customer>();
	Logger logger=Logger.getLogger(Test.class.getName());
	Scanner sc=new Scanner(System.in);
    void registerCustomer(){
    	System.out.println("Enter the customer Id");
    	customerId=sc.next();
    	System.out.println("Enter the customer name");
    	name=sc.next();
    	System.out.println("Enter the customer address");
    	address=sc.next();
    	Customer c=new Customer(customerId,name,address);
    	map.put(customerId, c);
    	//map.get(customerId).setTickets(tickets);
    	logger.info("Customer with customer id"+" "+customerId+" "+"was registered");
    }
    void book() throws Exception{
        System.out.println("Enter the customer id");
        customerId=sc.next();
        if(map.containsKey(customerId)){
    	System.out.println("enter from place");
    	from_P=sc.next();
    	System.out.println("enter to place");
    	to_P=sc.next();
    	System.out.println("enter amt");
    	amt=sc.nextInt();
    	System.out.println("Enter date");
    	date=sc.next();
    	Ticket t1=new Ticket(from_P, to_P, amt, date);
    	tickets.add(t1);
    	//map.get(customerId).getTickets();
    	logger.info("Ticket was added");
    	}else 
    		System.out.println("Please register  before booking");
    }	
    	
		
 
    void view() throws Exception{
    	System.out.println("Enter customer id to view the ticket");
    	customerId=sc.next();
    	if(map.containsKey(customerId)){
    		System.out.println("Your ticket is");
    		System.out.println(Customer.customerId+"\t"+Customer.name+"\t"+Customer.address+"\t"+
    				Ticket.from_P+"\t"+Ticket.to_P+"\t"+Ticket.amt+"\t"+Ticket.date);
    				
    		logger.info("Ticket viewed");
    	}
    	else
    		System.out.println("Ticket does not exist register and retry");
    }
   
    void delete(){
    	System.out.println("Enter customer id to delete that ticket");
    	customerId=sc.next();
    	if(map.containsKey(customerId)){
    		map.remove(customerId);
    	}
    	logger.info("Ticket deleted");
    }
void status(){
    	System.out.println("Enter the customer id to check the status of the ticket");
    	customerId=sc.next();
    	if(map.containsKey(customerId)){
    		System.out.println("Your ticket exists");
    	}else 
    		System.out.println("Your ticket does not exist please add it");
    	logger.info("Ticket status viewed");
    }
	public Test() {
		super(customerId, name, address);
		
	}

	public Test(String customerId, String name, String address) {
		super(customerId, name, address);
	}
	public static void main(String[] args) throws Exception {
		PrintStream ps=new PrintStream(System.out);
		Test obj=new Test();
		Scanner scn=new Scanner(System.in);
		String next = "yes";
		while(next.equalsIgnoreCase("yes"))
		{
		System.out.println("Enter a choice for");
		System.out.println("Press 1 for Register customer");
		System.out.println("Press 2 for Booking a ticket");
		System.out.println("Press 3 for Viewing ticket booked");
		System.out.println("Press 4 for Deleting the ticket");
		System.out.println("Press 5 for checking  the status of the ticket");
		int ch=scn.nextInt();
		switch(ch){
		case 1:
			obj.registerCustomer();
			break;
		case 2:
			obj.book();
			break;
		case 3:
			obj.view();
			break;
		case 4:
			obj.delete();
			break;
		case 5:
			obj.status();
			break;
			default:
				System.out.println("invalid choice");
				break;
		}
		System.out.println("Do you wish to continue? Type yes or no");
		 next=scn.next();
		if(next.equalsIgnoreCase("no")){
			System.exit(0);
		}
		}


	}

	 
	}
