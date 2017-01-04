package Arrays.Comperator;

import java.util.ArrayList;

public class Test {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ArrayList <ArrayPojo> arrayList = new ArrayList<ArrayPojo>();
		ArrayPojo element1 = new ArrayPojo();
		element1.setName("ABC");
		element1.setSalary(5000);
		
		ArrayPojo element2 = new ArrayPojo();
		element2.setName("xyz");
		element2.setSalary(100000);
		
		
		arrayList.add(element2);
		arrayList.add(element1);
		System.out.println("Before Sort");
		for (ArrayPojo e : arrayList ){
			
			System.out.println(e.getSalary());
		}
		
		arrayList.sort(new ArrayComperator());
		System.out.println("after Sort");
		for (ArrayPojo e : arrayList ){
			
			System.out.println(e.getSalary());
		}
	}

}
