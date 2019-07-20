package com.ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingAndRepeatingNumber {
	
	public static void main(String[] args) {
		int[] arr= {2,1,3,8,6,1,4,3,5};
		Arrays.sort(arr);
		
		List<Integer> multipleTimes=new ArrayList<Integer>();
		List<Integer> missingNumbers=new ArrayList<Integer>();
		List<Integer> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
		Set<Integer> set = new LinkedHashSet<>();
		int number=0;
		for(Integer i: list) {
			if(set.contains(i))
				multipleTimes.add(i);
			set.add(i);
		}
		
		List<Integer> list1=new ArrayList<>();
		list1.addAll(set);
		for(int i=0; i<list1.size()-1;i++) {
			number=list1.get(i);
			if((number+1)!=list1.get(i+1))
				missingNumbers.add(number+1);
		}
		
		System.out.println(multipleTimes +"   "+missingNumbers);
		
		//using map
		List<Integer> multipleTimes1=new ArrayList<Integer>();
		List<Integer> missingNumbers1=new ArrayList<Integer>();
		int[] reaptArr= {};
		Map<Integer,Boolean> map=new HashMap<>();
		int length=arr.length;
		for(Integer i: arr) {
			if(map.get(i)==null) {
				map.put(i, true);
			}
			else {
				multipleTimes1.add(i);
			}
		}
		
		for(int i=1;i<length;i++) {
			if(map.get(i)==null) {
				missingNumbers1.add(i);
			}
		}
		System.out.println(multipleTimes1 +"  "+missingNumbers1);
	}

}
