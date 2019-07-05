package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	int roll;
	String name;
	
	Student(int roll, String name){
		this.roll = roll;
		this.name= name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		//return roll>o.getRoll() ? 1 : roll==o.getRoll() ? 0 : -1;
		//return this.roll - o.roll;
		return this.name.compareToIgnoreCase(o.getName()); // only for String
	}
	
}

public class ComparableClass {
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(4);
		Collections.sort(list);
		System.out.println(list);
		
		Student s1 = new Student(2,"Ram");
		Student s2 = new Student(1,"Abir");
		Student s3 = new Student(3,"Bibek");
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Collections.sort(students);
		
		for(Student s : students) {
			System.out.println(s.getRoll() +"  "+ s.getName());
		}
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("java");
		queue.add("c");
		queue.add("corejava");
		System.out.println(queue);
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
