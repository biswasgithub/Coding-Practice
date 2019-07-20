package com.ArraysPractice;

import java.io.IOException;

public class MyException {

	public static void call1(int b) throws ClassNotFoundException, IOException{
		if (b == 1) {
			throw new ClassNotFoundException("ClassNotFound Exception");
		} else {
			throw new IOException("IOException Exception");
		}
	}

	public static void call3(int b) throws ClassNotFoundException, IOException{
		if (b == 3) {
			throw new ClassNotFoundException("ClassNotFound Exception");
		} else {
			throw new IOException("IOException Exception");
		}
	}
	
	public static void main(String[] args) {

		try {
			call1(1);
			call3(3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(7 + 1);
	}

}
