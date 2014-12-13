package com.bayamp.homework;

public class ReverseAnString {

	public static void main(String [] args){

		String category = "Administrative";
		char[] temp = reverseTheString(category);

		char[] names = {'e','v','i','t','a','r','t','s','i','n','i','m','d','a'};
		reverseMyCharacterToString(names);


		String temporary = "evitartsinimda";
		String reverse = reverseTheReversedString(temporary);

		String bank = " authorization";
		String website = " verification";
		String team = " money"	;
		reverseTheReversedStringEx(bank,website,team);

	}

	public static char[] reverseTheString(String category){

		char[] obj = category.toCharArray();
		int size = category.length();
		char[] temp = new char[14];
		int counter =0;
		for(int i=size-1; i >=0; i--){
			temp[counter] = obj[i];
			System.out.println(" I would like to have a new thing " + temp[counter]);	
			counter++;
		}
		return	temp;
	}

	public static String reverseMyCharacterToString(char[] names){
		String temp = new String(names);
		for (int i=13; i<names.length; i ++){
			System.out.println(" Hi I need to know my String " + temp);
		}
		return temp;
	}

	public static String reverseTheReversedString(String temp){
		StringBuffer cat = new StringBuffer(temp);
		String reverse = cat.reverse().toString();
		System.out.println(" I want back my reversed string " + reverse );
		return reverse;
	}


	public static String reverseTheReversedStringEx(String loan , String installments, String documents){
		StringBuffer cat1 = new StringBuffer(documents);
		cat1.append(installments);
		System.out.println(" I have used my append method " + cat1 );
		return loan;
	}
}
