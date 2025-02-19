package Methods;

public class NonStatic_Method {
		
	public void m3() {
		System.out.println("Non Static Method Call from same class");
	}
	
	public void m4() {
		System.out.println("Non Static Method Call from different class");
	}
	
	public static void main(String[] args) {
		NonStatic_Method nsm = new NonStatic_Method();
		nsm.m3();
		
	}
}
