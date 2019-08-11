package com.string;

public class Uncommoncharacters {
	
	public static void uncommonCharacter(String str1, String str2) {
		String str3="";		
		
		for(String s: str2.split("")) {
			if(!str1.contains(s)) {
				System.out.print(s);
				str3=str3+s;
			}
		}
		
		System.out.println();
		for(String s: str1.split("")) {
			if(!str2.contains(s)) {
				System.out.print(s);
				str3=str3+s;
			}
		}
		System.out.println();
		System.out.println(str3);
	}
	
	public static void main(String[] args) {
		String str1="characters";
		String str2="alphabets";
		uncommonCharacter(str1,str2);
	}

}
