package com.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static int totalSum(String str) {
		int sum=0;

		String[] arr=str.split(" ");
		for(String x:arr) {
			Pattern p = Pattern.compile( "[0-9]" );
		    Matcher m = p.matcher( x );
		    if(m.find()) {
		    	sum=sum+Integer.parseInt(x);
		    }
		}
		return sum;
	}
	public static void main(String[] args) {
		String str="All is 60 Well 10 Good 30";
		int sum=totalSum(str);
		System.out.println(sum);
	}
}
