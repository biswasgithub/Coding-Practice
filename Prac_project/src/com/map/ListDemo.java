package com.map;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	
	Employee1(int id, String name){
		this.id = id;
		this.name= name;
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
		
		return (this.id +" "+this.name);
	}
	
	@Override
	public int compareTo(Employee1 e) {
		return this.id - e.id;
	}
}


public class ListDemo<T extends Number> {
	
	public static void m1(ArrayList<String> l) {
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("D");
		list.add("B");
		list.add("A");
		list.add("C");
		
		System.out.println(list);
		
		//list.sort(Comparator.naturalOrder());
		//System.out.println(list);
		
		list.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("Sort List using Collections method:  "+list);
		//Collections.reverse(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse list using Collections method:  "+list);
		 
		Employee1 e1=new Employee1(400, "Ram");
		Employee1 e2=new Employee1(100, "Rahul");
		Employee1 e3=new Employee1(300, "Shaym");
		Employee1 e4=new Employee1(200, "John");
		
		ArrayList<Employee1> employeeList=new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		System.out.println("Before sorting: "+ employeeList);
		Collections.sort(employeeList);
		
		System.out.println("After sorting:  "+employeeList);
		
		
		Collections.sort(employeeList, (d1,d2) -> {
			return d1.getId() - d2.getId();
		});	
		
		System.out.println("After sorting:  "+employeeList);
	}
}
