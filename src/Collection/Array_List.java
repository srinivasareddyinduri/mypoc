package Collection;
import java.util.*;

public class Array_List {
public static void main(String[] args) {
	
	// ArrayList
	ArrayList al = new ArrayList();
	al.add("Srinivas");
	al.add(100);
	al.add(10.5);
	al.add('c');
	al.add(true);
	al.add(null);
	System.out.println(al);
	
	//LinkedList
	LinkedList ll = new LinkedList();
	ll.add(11);
	ll.add("vasu");
	ll.add(null);
	ll.add(10.5);
	System.out.println(ll);
	
	//vector
	Vector v = new Vector();
	v.add("reddy");
	v.add(123);
	v.add(null);
	System.out.println(v);
	
}
}
