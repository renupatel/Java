package Arrays.Comperator;

import java.util.Comparator;

public class ArrayComperator  implements Comparator<ArrayPojo>{

	@Override
	public int compare(ArrayPojo o1, ArrayPojo o2) {
		if(o1.getSalary() > o2.getSalary()){
			return 1;
		}else if (o1.getSalary() < o2.getSalary()){
			return -1;
		}else{
			return 0;
		}
	}

	
}
