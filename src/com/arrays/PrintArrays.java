package com.arrays;

public class PrintArrays {

	public static void main(String[] args) {
		
		int[] a= {10,20,30,40};
		//way1 to retrieve
		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}

		
		for(int i :a) {
			System.out.println(i);
		}
	}

}
