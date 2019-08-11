package com.prac;

import java.util.LinkedHashSet;
import java.util.Set;

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
		Set<Integer>list=new LinkedHashSet<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.contains(5));
	}
	
}
