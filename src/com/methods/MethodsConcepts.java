package com.methods;

public class MethodsConcepts {

	public static void main(String[] args) {
	
		MethodsConcepts mc = new MethodsConcepts();
		int c = mc.add();
		System.out.println(c);
		
		mc.sum();
		
		
		System.out.println(mc.division(30, 6));
		
		
		
	
		}
	
	//User defined----
	//1. no input no output
	
	public void sum() {    // o-parameterized
		
		System.out.println("sum");
		
		}
	
	//2. no input some output
	
	public int add() {
		System.out.println("addition");
		int a=10;
		int b= 20;
		int c= a+b;
		return c;
		
	}
	
	//3.some input and some output
	
	
	
	public int division(int x, int y)  //2 parameterized
	{

		     int div= x/y;
		     return div;
		     
	   
	}
	
	

}
