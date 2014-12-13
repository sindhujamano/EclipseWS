package com.bayamp.homework;

import java.util.StringTokenizer;

public class ZipCode {

	public static void main(String[] args){

		String myDetails = new String (" 484 unit 185 Dempsey Road Milpitas CA 95035 ");
		String[] collecting = myDetails.split(" ");
		for(int i =0; i<collecting.length; i++)
		System.out.println(" Print my home address zipcode " + collecting[8]);

		stringTokenizerMethod();
	}

	public static String stringTokenizerMethod(){
		String notes = new String ("Environment Class is a file Whenever you use the class you should know where the class is located");
		StringTokenizer receive = new StringTokenizer(notes);
		while (receive.hasMoreElements()) {
			System.out.println(receive.nextElement());
		}
		return notes;
	}
}



