package DataTypes_Variables;

public class Global_Variables {
	int i =10; // Gloabl Variable
	int j=20;

	public static void main(String[] args) {
		Global_Variables gv = new Global_Variables(); // to load non static memebers of class, object created here.
		// new keyword creates empty memory block and constructor loads non static members of class(variables & Methods)
		System.out.println(gv.i);
		System.out.println(gv.j);
	}
	
	
	
}
