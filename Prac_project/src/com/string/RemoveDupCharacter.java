package com.string;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupCharacter {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		
		System.out.println(a);
		
		//String a = "azxxzyyyddddyzzz";
		//String a  = "cbbbaaaabbbccc";
		/*
		 * 
		 */
	    
	    String result = removeData(a);
	    
	    System.out.println(result);
	}
	
	public static String removeData(String a) {
		ArrayList a2=new ArrayList<>();
		for(int i=0;i<a.length();i++) {
				a2.add(a.charAt(i)); 
			}
		
		if(a2.size()==2)
	    {
	        if(a2.get(0)==a2.get(1))
	                return null;                
	        }

	    for(int i=0;i<a2.size();i++)
	    {
	        int count =1;
	        for(int j=0;j<a2.size()-1;j++)
	        {
	            if(a2.get(j)==a2.get(j+1))
	            {
	                count++;
	            }
	            else if(count%2==0)
	            {
	                for(int k=0;k<count;k++)
	                {
	                    a2.remove(j-k);
	                }
	            }               
	        }       

	    }
	    String result = "";
	    
	    for(int j = 0; j<=a2.size()-1; j++) {
	    	result = result.concat(a2.get(j).toString());
	    }
	    
	    
	return result;
	}

}
