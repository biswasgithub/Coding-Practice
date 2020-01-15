package com.ArraysPractice;

public class KadaneAalgo {
	public static void main(String[] args) {
		
		//int[] arr=new int[] {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,-1,3,1,2};
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_so_far=arr[0];
		int max_ending_here=0;
		int start=0, end=0 , s=0;
		
	/*	for(int i =0 ; i<arr.length-1; i++) {
			max_ending_here=max_ending_here+arr[i];
			
			if(max_so_far<max_ending_here) {
				max_so_far=max_ending_here;
				start=s;
				end=i;
			}
			if(max_ending_here<0) {
				max_ending_here=0;
				s=i+1;
			}
		}
		*/
		
	// Above program can be optimized further, if we compare max_so_far with max_ending_here only if max_ending_here is greater than 0.
		
		for (int i = 0; i < arr.length-1; i++)  
	    {  
	        max_ending_here = max_ending_here + arr[i]; 
	        if (max_ending_here < 0)  
	        {
	            max_ending_here = 0;  
	            s=i+1;
	        }  
	        /* Do not compare for all 
	           elements. Compare only  
	           when max_ending_here > 0 */
	        else if (max_so_far < max_ending_here) 
	        {
	            max_so_far = max_ending_here; 
	            start=s;
	            end=i;
	        } 
	    }   
		
		System.out.println("start index: "+start +"  end index: "+end +"  sum: "+ max_so_far);
	}

}
