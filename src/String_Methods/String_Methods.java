package String_Methods;

public class String_Methods {
public static void main(String[] args) {
		String s = "vasu"; String s1 = "vasu"; String s2="va";		
		//1. length()
		System.out.println(s.length());
		
		//2. toUpperCase()
		System.out.println(s.toUpperCase());
		
		//3. toLowerCase()
		System.out.println(s.toLowerCase());

		//4. equals()
		System.out.println(s.equals(s1));
		
		// 5. equalsIgnoreCase()
		System.out.println(s.equalsIgnoreCase(s1));		
		
		//6. contains()
		System.out.println(s.contains(s2));
		
		//7. charAt()
		System.out.println(s.charAt(0));
		
		//8. indexOf()
		System.out.println(s.indexOf("u"));
		
		//9. startsWith()
		System.out.println(s.startsWith("a"));
		
		//10. endsWith()
		System.out.println(s.endsWith("u"));
		
		//11. substring()
		System.out.println(s.substring(1));
		
		//12. concat()
		System.out.println(s.concat(s2));
		
		//13. replace()
		System.out.println(s.replace("vasu", "srinivas"));
		
				
}

}
