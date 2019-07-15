package com.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	
	//private static final long serialversionUID = 129348938L; 
	int id ;
	String name;
	static int b;
	
	Demo(int id, String name, int b){
		this.id=id;
		this.name=name;
		this.b=b;
	}
	
}

public class TestSerialization  {
	public static void main(String[] args) throws ClassNotFoundException {
		Demo object = new Demo(1,"Ram",100);
		
		String fileName ="Myfile.txt"; 
		int[] arr= {1,2,3,4};
		try {
			FileOutputStream outputStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			
			objectOutputStream.writeObject(arr);
			objectOutputStream.close();
			outputStream.close();
			object.b=2000;
		}
		catch(IOException e){
			System.out.println("IOException is caught"); 
		}
		
		
		try {
			Demo object1=null;
			int arr1[] = {};
			FileInputStream fileInputStream = new FileInputStream(fileName);
			@SuppressWarnings("resource")
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			arr1=(int[]) objectInputStream.readObject();
			//object1= (Demo)objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
			for(int i:arr1) {
				System.out.println(i);
			}
			//System.out.println(object1.id +"  "+object1.name+"  "+ object1.b);

		}
		catch(IOException e){
			System.out.println("IOException is caught"); 
		}
		
	}
}
