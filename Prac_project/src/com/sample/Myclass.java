package com.sample;

import java.io.BufferedReader;

class Parent {

	private String name="";
	
	Parent(){
		System.out.println("Parent no-arg constructor");
	}
	
	public Parent(int i){
		System.out.println("Parent with-arg constructor");
		return;
	}
}

class Child extends Parent {

	Child(){
		this(10);
		
	}
	
	Child(int i){
		System.out.println(i);
	}
	
	private void m1() {
		System.out.println("Parent class");
		int x=10/0;
	}

}

class Myclass {

	public static void modify(Integer i) {
		System.out.println("Inside modify: "+ i);
		i=i+1;
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		BufferedReader rd = null;
		
		Integer i = new Integer(10000);
		i=10+i;
		System.out.println("i: "+ i);
		
		modify(i);
		System.out.println("i: "+ i);
		
		Integer i1= new Integer("1258");
		Double d1=new Double("1000.56454645489454654654654");
		float f=1000.56454645489454654654654f;
		Float f1=new Float("1408");
		
		System.out.println("Integer value: "+i1 +"  double: "+d1+" float: "+f1);

		Boolean x1=new Boolean("trUe");
		Boolean y=new Boolean("TRUE");
		System.out.println("x1: "+ x1  +" y: "+ y);
		System.out.println(x1.equals(y));
		
		
		
        try {
			/*
			 * String filename = "input.txt"; // Open the file for reading. rd = new
			 * BufferedReader(new FileReader(new File(filename)));
			 */
             int x=10/0;
             throw new ArithmeticException("Exception caught");
        }  
        
        catch(ArithmeticException e){
        	
        }
		finally {
			System.out.println("Finally Block");
			//int x=10/0;
		}
		System.out.println("After finally");
	}
}
