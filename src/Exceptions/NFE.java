package Exceptions;

public class NFE { // NumberFormatException
 public static void main(String[] args) {
	 try {
	System.out.println(Integer.parseInt("202k")); }
	 catch (NumberFormatException e) {
		// TODO: handle exception
		 System.out.println("Number Format Exception Handeled");
	}
}
}
