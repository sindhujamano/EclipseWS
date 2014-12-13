package com.bayamp.homework;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int[] array1={1,2,3,4,5};
		int[] array2={6,7,8,9,10};
		int arrayMergeLength=array1.length+array2.length;
		
		int arraydiff=arrayMergeLength-array1.length;
		
		//System.out.println(arraydiff);
		
		int[] arrayMerge=new int[arrayMergeLength];
		for(int i=0;i<array1.length;i++){
			arrayMerge[i]=array1[i];
			//System.out.print(arrayMerge[i]);
		}
		for(int i=arraydiff;i<arrayMergeLength;i++){
			arrayMerge[i]=array2[i-arraydiff];
			//System.out.print(arrayMerge[i]);
		}
		for(int i=0;i<arrayMergeLength;i++){
			System.out.print(arrayMerge[i]);
		}
			

	}

}
	
	


