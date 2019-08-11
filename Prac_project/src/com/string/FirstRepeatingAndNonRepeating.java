package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRepeatingAndNonRepeating {

	public static void repeatAndNonRepeat(char arr[]) {
		
		Map<Character,Integer>map=new LinkedHashMap<>(arr.length);
		List<Character> list=new ArrayList<>();
		Set<Character> set=new HashSet<>();
		char repeat='\0';
		char non_repeat='\0';
		for(Character ch: arr) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		
		for(Character ch : arr) {
			//1st repeating character
			if(map.get(ch)>1) {
				repeat=ch;
				break;
			}
			//1st non-repeating character
			
			  if(map.get(ch)==1) {
				non_repeat=ch;
				break;
			  }
		}
		
		for(Character ch : arr) {
			// repeating character
			if(map.get(ch)>1)
				set.add(ch);
		}
		
		Set<Entry<Character,Integer>> entry=map.entrySet();
		for(Entry<Character,Integer> e: entry) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}	
		
		System.out.println("Repeat  " +repeat+"  Non-Repeat  " +non_repeat);
		System.out.println(set);
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char[] arr = str.toCharArray();
		repeatAndNonRepeat(arr);
	}
}
