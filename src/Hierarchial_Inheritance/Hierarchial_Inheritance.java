package Hierarchial_Inheritance; // 2 sub classes acquiring properties from 1 super class

public class Hierarchial_Inheritance {	
	
	public static void main(String[] args) {
		
		Boy b = new Boy();
		b.bike();
		b.home();
		b.land();
		b.car();
		
		Girl g = new Girl();
		g.bike();
		g.home();
		g.land();
		g.car();
		
	}
}
