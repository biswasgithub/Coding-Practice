package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;


interface PI1 {

}

interface PI2 {

}

class Grandparent {

}

class Parent extends Grandparent {

	
}

class Child extends Parent  {
	
}

class Worker implements Comparable<Worker>{
	int id;
	
	Worker(int id){
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Worker o) {
		// TODO Auto-generated method stub
		if(this.id<o.id)
			return -1;
		else if(this.id>o.id) {
			return 1;
		}
		else
			return 0;
	}
	
	public String toString() {
		return "ID: "+ id;
	}
}

public class InheritanceClass {

	public static void main(String[] args) {
		
		List<Integer> alist=Arrays.asList(7,2,8,1,9,5,3);
		
		HashSet<Integer> hset=(HashSet)alist.stream().collect(Collectors.toSet());
		System.out.println(hset);
		
		TreeSet<Integer> tset = new TreeSet(hset);
		System.out.println(tset);
		
		List<Integer> list=tset.stream().collect(Collectors.toList());
		System.out.println(list);
		ArrayList<Integer> arrlist=(ArrayList)tset.stream().collect(Collectors.toList());
		System.out.println(arrlist);
		LinkedList<Integer> llist=new LinkedList<>(arrlist);
		
		Integer intArr[] = new Integer[alist.size()];
		intArr = alist.toArray(intArr);
		System.out.println(Arrays.toString(intArr));
		
		
	}
}
