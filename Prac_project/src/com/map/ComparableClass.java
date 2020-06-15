package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Student implements Comparable<Student> {
	
	int roll;
	String name;

	public Student(int roll) {
		super();
		this.roll = roll;
	}

	Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
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
	public String toString() {
		return this.roll +"  "+this.name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Student s = (Student) obj;
		System.out.println("Inside equals():  " + this.name + "   " + s.name);

		return Objects.equals(roll, s.roll) && Objects.equals(name, s.name);
		// return roll == s.roll && name.equals(s.name);
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public int compareTo(Student passedObj) {

		/*
		 * if (roll > passedObj.roll) { return 1; } else if (roll < passedObj.roll) {
		 * return -1; } else { return 0; }
		 */
		/*
		 * System.out.println("passedObj:  " + passedObj);
		 * System.out.println("this object:  " + this);
		 * System.out.println("Inside CompareTo() : Passed Object: " + passedObj.name +
		 * " " + passedObj.roll + "  this: " + this.name + " " + this.roll);
		 * 
		 * int diff= passedObj.roll - this.roll;
		 * System.out.println("Inside CompareTo() different: "+ diff);
		 * System.out.println("Inside CompareTo() different: " +
		 * this.name.compareTo(passedObj.name));
		 */

		// return this.roll - passedObj.roll;
		return roll > passedObj.getRoll() ? 1 : roll == passedObj.getRoll() ? 0 : -1; // ascending order
		// return roll>o.getRoll() ? -1 : roll==o.getRoll() ? 0 : 1;
		// decending order
		// return this.name.compareToIgnoreCase(passedObj.getName()); // only for String
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

		Student s1 = new Student(10, "Abir");
		Student s2 = new Student(2, "Bibek");
		Student s3 = new Student(3, "Ram");
		Student s4 = new Student(3, "Bibek");

		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println("S3:  " + s3);

		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		System.out.println("Before sorting:  "+ students);
		
		// System.out.println("Before sorting " + students.get(0) + " " +
		// students.get(1) + " " + students.get(2));
		Collections.sort(students);

		System.out.println("After sorting:  "+ students);
		
		// System.out.println("After sorting " + students.get(0) + " " + students.get(1)
		// + " " + students.get(2));
	}
}
