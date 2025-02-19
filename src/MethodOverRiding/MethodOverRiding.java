package MethodOverRiding; // Changing Super Class Method Implementation w.r.t Sub Class Method Implementation 


public class  MethodOverRiding {
  public static void main(String[] args) {
	  
	  SuperClass sup = new SuperClass();
	  		sup.wish();
	  
	  SubClass sub = new SubClass();
	  		sub.wish();
	  
	  SuperClass ss = new SubClass();
	  		ss.wish();
  }
}
