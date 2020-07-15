package com.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Parent {

	private String name = "";

	Parent() {
		System.out.println("Parent no-arg constructor");
	}

	public Parent(int i) {
		System.out.println("Parent with-arg constructor");
		return;
	}

	void display(int i) {

	}
}

class Child extends Parent {

	Child() {
		this(10);

	}

	Child(int i) {
		System.out.println(i);
	}

	private void m1() {
		System.out.println("Parent class");
		int x = 10 / 0;
	}

	void display() {

	}
	void display(int i) {

	}

}

class Myclass {

	public static void modify(Integer i) {
		System.out.println("Inside modify: " + i);
		i = i + 1;
	}

	public static void m2(String s1) {
		System.out.println("Stringh s1");
	}

	public static void m1(Object o1) {
		System.out.println("Object o1");
	}

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(null, 1);
		map.put(3, 2);

		Iterator itr1 = map.entrySet().iterator();
		while (itr1.hasNext()) {
			Entry en = (Entry) itr1.next();
			System.out.println(itr1.next());
		}

		System.out.println(itr1);

		Set s = map.keySet();
		Iterator itr = s.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		HashSet set = new HashSet();
		set.add(null);
		set.add(10);

		Iterator itr2 = set.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		m1(null);

		int a,b;
		for( a=1, b=4; a<b;a++,b--) {
			System.out.println("a= "+a);
			System.out.println("b= "+b);
		}
		
	}
}
