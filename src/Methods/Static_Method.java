package Methods;

public class Static_Method {
		

	public static void m1() {
		System.out.println("Static Method Calling from same class");
	}
	
	public static void m2() {
		System.out.println("Static Method Calling from different class");
	}

	public static void main(String[] args) {
	m1();
	}
}
