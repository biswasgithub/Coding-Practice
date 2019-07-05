package com.prac;

class Person{

}

class Student extends Person{
	void myMethod(Double I, Number N)
    {
        System.out.println(2);
    }
	
	void myMethod(Double I, Integer N)
    {
        System.out.println(2);
    }
	
	int y= (int)10.12;
}

public class Customer {
	public static void main(String[] args) {	
		Student student = new Student();
		student.myMethod(12.20, 15);
		
	}
	
}
