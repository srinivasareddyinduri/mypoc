package Exceptions;

public class SIOOBE { // String Index out of bounds Exception
 public static void main(String[] args) {
	String s = "demo" ; 
	try {
	System.out.println(s.charAt(6)); }
	catch (StringIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("String Index Out Of Bounds Exception Handeled");
	}
}
}
