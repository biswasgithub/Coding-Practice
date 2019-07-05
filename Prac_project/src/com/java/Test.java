package com.java;

import java.util.ArrayList;
import java.util.Collections;

class Customer implements Comparable<Customer>{
	int id;
	String name;
	Customer(int id, String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.id +"  "+this.name;
	}
	@Override
	public int compareTo(Customer o) {
		return this.getName().compareToIgnoreCase(o.getName());
		//return this.getId()-o.getId();
	}
}

public class Test {

	public static void main(String[] args) {
		ArrayList<Customer> plist= new ArrayList<Customer>();
		plist.add(new Customer(5,"Ram"));
		plist.add(new Customer(1,"Abil"));
		plist.add(new Customer(6,"John"));
		
		Collections.sort(plist);
		
		System.out.println("Using Comparable");
		for(Customer c : plist) {
			
			System.out.println(c);
		}
	}
	
}
