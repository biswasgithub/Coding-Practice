package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 {
	int roll;
	String name;
	
	Student1(int roll, String name){
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
	public String toString() {
		
		return this.roll +" "+this.name;
	}
}

class SortByName implements Comparator<Student1>{
	@Override
	public int compare(Student1 s1, Student1 s2) {
		
		return s1.name.compareTo(s2.getName());
	}
	

}
class SortByRoll implements Comparator<Student1>{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.roll-o2.roll;
	}
}

public class ComparatorClass {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(2,"Ram");
		Student1 s2 = new Student1(1,"Abil");
		Student1 s3 = new Student1(3,"John");
		ArrayList<Student1> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		Collections.sort(students, new SortByName()); 
		
		for(Student1 s : students) {
			System.out.println(s);
		}
		
		Collections.sort(students, new SortByRoll());
		for(Student1 s : students) {
			System.out.println(s);
		}
		
	}
	
	

}
