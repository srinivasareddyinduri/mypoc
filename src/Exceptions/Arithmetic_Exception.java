package Exceptions;

public class Arithmetic_Exception {
public static void main(String[] args) {
	int a =10;
	int b=0;
	try { 
	int c = a/b; 
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Hi");
	}
	finally { 
		System.out.println("Thank you for using ATM");
	}
	
}
}
