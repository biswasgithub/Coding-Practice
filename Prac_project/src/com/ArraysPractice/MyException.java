package com.ArraysPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyException {
	
	public static void main(String[] args) {
		
		int array[]= new int[] {5,7,85,6,45,25};
		List<Integer> list=Arrays.stream(array).boxed().collect(Collectors.toList());
		Collections.reverse(list);
		array=list.stream().mapToInt(Integer:: intValue).toArray();
		System.out.println(Arrays.toString(array));
	}
}
