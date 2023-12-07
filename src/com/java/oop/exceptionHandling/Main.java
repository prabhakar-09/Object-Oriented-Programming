package com.java.oop.exceptionHandling;

/*
 * There are mainly two types of exceptions 
 * -> Checked - compile time exception 
 * -> Unchecked - runtime.
*/
public class Main {

	public static void main(String[] args) throws MyException {

		int a = 5;
		int b = 0;
		String name = "PikuNiku";
//		int c = a/b;
		
//		System.out.println(c); // this will throw an divided by 0 exception something..
		
//		to handle the above exception we use a try catch block...
		try {
//			int c = a/b;
			divide(a,b);
		}
		catch(Exception e) { // we can also catch multiple exception by repeatedly adding catch block.
			System.out.println(e.getMessage());
		}
		finally { // There can be only one finally block not more than that.
			System.out.println("No matter what happens this will execute!!");
		}
		
		if(name.equals("PikuNiku")) {
			throw new MyException("Name is Peeku");
		}
	}
	
//									throws is used to declare exceptions saying it may throw an exception.
	static int divide(int a, int b) throws ArithmeticException {
		if(b == 0) {
//			throw means we are throwing an exception... 
			throw new ArithmeticException("Please do not divide by zeroooo!");
		}
		
		return a/b;
	}

}
