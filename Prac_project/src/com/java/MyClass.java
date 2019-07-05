package com.java;

class SingleTonClass {
	
	private static SingleTonClass obj=null;
	
	private SingleTonClass() {
		 
	}
	 
	public static SingleTonClass objectCreationMethod() {
		if(obj == null) {
			obj = new SingleTonClass();
		}
		return obj;
	} 
	
	public void display() {
		System.out.println("Hellow world");
	}
}

public class MyClass{
	public static void main(String[] args) {
		SingleTonClass o = SingleTonClass.objectCreationMethod();
		o.display();
	}
}