package com.bayamp.homework;

public class SwapTwoNumbers{
	
		public static void main(String args[]){
			
		int phone = 30;
		int laptop= 40;	
		int temp;
		
		temp = phone;
		phone = laptop;
		laptop = temp;
		
	System.out.println("The Phone quantity is :" + phone + "and  The laptop quantity is" +laptop );
	
			// without using the temp variable
	
	int apple = 5;
	int bananas = 10;
	
	apple = apple + bananas; // apple = 15
	bananas = apple - bananas; // bananas = 5
	apple = apple - bananas; // apple = 10
	
	System.out.println(" the apple is " + apple + "and the banana is: " + bananas );
	
	
		
		}
			
		
	}


