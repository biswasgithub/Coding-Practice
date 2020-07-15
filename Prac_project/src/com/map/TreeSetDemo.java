package com.map;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	
	Employee(int id, String name){
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
	public int compareTo(Employee o) {
		
		return o.id-id;
	}
}

//sort By keys
class SortByKey implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
		return s1.compareTo(s2);
	}
}

class SortById implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getId()-e2.getId();
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("D");
		ts.add("A");
		ts.add("C");
		ts.add("B");
		
		System.out.println("Ascending order treeset: "+ts);
		
		TreeSet<String> reverseTs = (TreeSet<String>)ts.descendingSet();
		
		System.out.println("Reverse/Descendeing TreeSet: "+ reverseTs);
		
		// Creating a TreeSet with a custom Comparator (Descending  Order)
        SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Descendeing Order Fruits Set : " + fruits);
        
        //Navigable treeSet
        System.out.println(fruits.first());
        System.out.println(fruits.last());
        
        
        TreeSet<Employee> treeSet=new TreeSet<>();
        Employee e11=new Employee(400, "Ram");
        Employee e21=new Employee(200, "Shyam");
        Employee e31=new Employee(100, "Rahul");
        Employee e41=new Employee(300, "John");
        treeSet.add(e11);
        treeSet.add(e21);
        treeSet.add(e31);
        treeSet.add(e41);
        System.out.println("Descending order of treeSet:  "+treeSet);
        
        System.out.println("\n*******************TreeMap***************\n");
        
        TreeMap treeMap=new TreeMap(new SortByKey());
        Employee e1=new Employee(400, "Ram");
        Employee e2=new Employee(200, "Shyam");
        Employee e3=new Employee(100, "Rahul");
        Employee e4=new Employee(300, "John");
        
        treeMap.put("A", e1);
        treeMap.put(1,e2);
        treeMap.put("B", e3);
        treeMap.put(2, e4);
        
        System.out.println("Keys are hetero-geneous with custom comparable: "+treeMap);
        
        TreeMap<Employee, Integer> treeMap1=new TreeMap<>(new SortById());
        treeMap1.put(e1, 1111);
        treeMap1.put(e2, 22222);
        treeMap1.put(e3, 3333);
        treeMap1.put(e4, 4444);
        System.out.println(treeMap1);
        
	}
}
