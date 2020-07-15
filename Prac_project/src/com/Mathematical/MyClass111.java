package com.Mathematical;

public class MyClass111 {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<= 100 ; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.print("Thanks,");
			}
			
			else {
				if(i%3==0) {
					System.out.print("Hello,");
				}
				else if(i%5==0) {
					System.out.print("Infy,");
				}
				else {
					System.out.print(i +",");
				}
			}
			
		}
		
	}

}
