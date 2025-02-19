package Exceptions;

public class NPE {
	int i =10;
	public static void main(String[] args) {
		try {
		NPE n = null;
		System.out.println(n.i); 
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer Exception handeled");
		}
	}
}
