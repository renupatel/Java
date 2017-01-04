package Arrays;

import java.util.ArrayList;

public class ArrayList1 {
	


	public static void main(String[] args) {
		
		//ArrayList al = new  ArrayList();
		ArrayList<String> al = new ArrayList<String>();

		for(int i =0 ; i< 10 ;i++){
			al.add("welcome"+i);
		} 
		
		System.out.println("Size of al after additions: " + al.size());

	    System.out.println("Contents of al: " + al);

	    /* to remove elements from array */
	    
	    al.remove(2);
	    al.add("Hi there");
	   
	    System.out.println("Size of al after deletions: " + al.size());
	    System.out.println("Contents of al: " + al);
	    /* get the elements from particular index*/
System.out.println(al.get(5));	    
	
	}




	
}
