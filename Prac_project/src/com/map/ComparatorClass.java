package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

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


// SortByName
class SortByName implements Comparator<Student1>{
	@Override
	public int compare(Student1 s1, Student1 s2) {
		
		//System.out.println("S1: "+ s1.name +"  S2: "+ s2.name);
		
		return s1.name.compareTo(s2.getName());
	}
	

}


// insertionOrder/ reverse insertionOrder
class InsertionOrder implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		 return 1;
		//return -1;
	}
	
}

// SortByRoll
class SortByRoll implements Comparator<Student1>{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.roll-o2.roll;
	}
}

class StudentSortingComparator implements Comparator<Student1>{
	public int compare(Student1 o1, Student1 o2) {
		int nameCompare= o1.name.compareTo(o2.name);
		int rollComare=o1.roll - o2.roll;
		
		if(nameCompare == 0) {
			return (rollComare == 0) ? nameCompare : rollComare;
		}
		else
			return nameCompare;
	}
}


public class ComparatorClass {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(2,"Ram");
		Student1 s2 = new Student1(1,"Abil");
		Student1 s3 = new Student1(3,"John");
		Student1 s4 = new Student1(4,"Rahul");
		Student1 s5 = new Student1(2,"Souvik");
		Student1 s6 = new Student1(3,"Abil");
		ArrayList<Student1> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
		System.out.println("Sort List By Name:\n");
		Collections.sort(students, new SortByName()); 
		
		for(Student1 s : students) {
			System.out.println(s);
		}
		
		System.out.println("\nSort List By roll: \n");
		
		Collections.sort(students, new SortByRoll());
		
		for(Student1 s : students) {
			System.out.println(s);
		}
		
		Collections.sort(students, new StudentSortingComparator());
		System.out.println("\nSort Student based on name and roll:  \n");
		
		for(Student1 s : students) {
			System.out.println(s);
		}
		
		//TreeSet
		
		Student1 s7 = new Student1(200,"Ram");
		Student1 s8 = new Student1(100,"Abil");
		Student1 s9 = new Student1(300,"John");
		
		/*
		 * TreeSet<Student1> ts2=new TreeSet<>(); ts2.add(s7); ts2.add(s8); ts2.add(s9);
		 */
		
		//System.out.println("TreeSet example:  "+ts2);
		
		TreeSet<Student1> ts1=new TreeSet<>(new InsertionOrder());
		ts1.add(s7);
		ts1.add(s8);
		ts1.add(s9);
		
		System.out.println("Insertion Order in treeSet: \n");
		for(Student1 s : ts1) {
			System.out.println(s);
		}
		
		TreeSet<Student1> ts=new TreeSet<>(new SortByRoll());
		ts.add(s7);
		ts.add(s8);
		ts.add(s9);
		
		System.out.println("\nTreeSet Sort by roll: \n");
		for(Student1 s : ts) {
			System.out.println(s);
		}
		
	}
	


}
