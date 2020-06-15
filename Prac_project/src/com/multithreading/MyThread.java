package com.multithreading;

public class MyThread {
	
	private MyThread(int a) {
		
	}
	
	public static String foo(String str) {
		
		char[] chars=str.toCharArray();
		int right=chars.length-1;
		for(int left=0; left<right; left++) {
			char swap=chars[left];
			chars[left]=chars[right];
			chars[right--]=swap;
		}
		return new String(chars);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(foo("hello world"));
	}
}
