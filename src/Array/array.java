package Array;


public class array {
	
	// Integer Array
		int[] i = {12,13,14,15,16};
		
		
	//String Array
		String[] s = {"vasu","nihi" };
	   

	public  void loop() {
		
		 int y = i.length; // Array Length Finding
		    for(int x=0; x<y; x++) {
		    	System.out.println(i[x]);
		    } }
		
	
public static void main(String[] args) {
	 array a = new array();
	a.loop();
	
  
}
}