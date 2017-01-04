package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		   byte byteArr[] = {10,20,15,22,35};
		  
		   /*  */
		   System.out.println("Before Sorting");
		   for(byte b : byteArr){
			   System.out.println(b);
		   }
		   
		   Arrays.sort(byteArr);

		   System.out.println("After Sorting");
		   for(byte b : byteArr){
			   System.out.println(b);
		   }
		   
		   byte searchVal = 35;

		   /* Binary search*/
		   
		   int retVal = Arrays.binarySearch(byteArr,searchVal);
		   
		   int retVal2 = Arrays.binarySearch(byteArr,0,3,searchVal);
		   
		   System.out.println(retVal);
		   System.out.println(retVal2);
		   /* convert the array to list */
		   
		   List arList = Arrays.asList(byteArr);
		   
		   boolean[] arr1 = new boolean[] {true, false};
		   boolean[] arr2 = Arrays.copyOf(arr1, 4);
		   
		   for (int i = 0; i < arr2.length; i++) {
			   System.out.println(arr2[i]);
			   }

		   Object[] b1 = new Object[] { 'a', 'b' };
		   Object[] b2 = new Object[] { 'a', 'b' };
		   
		   System.out.println("Array1 and Array2 are equal:" 
				   + Arrays.deepEquals(b1,b2));
		   
		   //initializing an object array
		   Object[] ob={ "tuts","point" };
		    
		   // deephashcode for object ob
		   int retval=Arrays.deepHashCode(ob);
		    
		   // printing value
		   System.out.println("The Hash Code of ob is:" + retval);
		   
		   int arr[] = new int[] {1, 6, 3, 2, 9};
		   Arrays.fill(arr, 18);
		   
		   for (int value : arr) {
			   System.out.println("Value = " + value);
			   }
		   int arr3[] = new int[] {1, 6, 3, 2, 9};
		   Arrays.sort(arr3);
		   for (int value : arr3) {
			   System.out.println("Value = " + value);
			   }

	}

}
