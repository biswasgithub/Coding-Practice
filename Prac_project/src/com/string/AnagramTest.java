package com.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramTest {

	public static boolean IsAnagram(String str1,String str2) {
	
		//using list
		/*
		 * List<Character>list1=str1.chars().mapToObj(c->(char)c).collect(Collectors.
		 * toList());
		 * List<Character>list2=str2.chars().mapToObj(c->(char)c).collect(Collectors.
		 * toList());
		 * 
		 * System.out.println(list1.size()+"  "+list1);
		 * 
		 * list1.retainAll(list2); System.out.println(list1.size()+"  "+list1);
		 * if(list1.size() == list2.size()) return true; return false;
		 */
		
		//using sorting
		char[] strArray1=str1.toCharArray();
		char[] strArray2=str2.toCharArray();
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		
		for(int i = 0; i<strArray1.length;i++) {
			if(strArray1[i]!=strArray2[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str1="silent";
		String str2="senlit";
		
		System.out.println(IsAnagram(str1,str2));
	}
}
