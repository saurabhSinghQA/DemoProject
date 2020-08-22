package com.exception;

public class ExceptionHandling {
//	int a=10;
//	
//	 static ExceptionHandling obj;
	public static void main(String[] args) {
//	int i = 9/0; //uncaught exception
//		
//		System.out.println(i);
		
		//caught exception
		//Thread.sleep(2000);

//		ExceptionHandling obj = new ExceptionHandling();
//		obj= null;
		//System.out.println(obj.a);


        //Handling Exception

      //1. try - catch
       try {
    	   //int i = 9/0;  //this line may throw exception
		
	} catch (Exception e) {   //catch block will execute only there is any exception in try
	   e.printStackTrace();   //handler code
	    
	   System.out.println(e.getMessage());
	}
     System.out.println("ccc");

	}

}
