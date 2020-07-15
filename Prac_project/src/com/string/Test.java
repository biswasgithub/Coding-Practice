package com.string;

class Student{
	int roll;
	String name;
	public Student(int roll, String name) {
		super();
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
	
	
}

public class Test {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="knowledge";
		//String s=str;
		str=str.concat(" base");
		System.out.println(str);
		System.out.println(str.equals(str));
		Student student1 = new Student(101, "Durga");
		Student student2 = new Student(101, "Durga");
		System.out.println(student1.equals(student2));
		
		
	}

}
