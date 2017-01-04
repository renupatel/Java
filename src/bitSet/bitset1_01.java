package bitSet;

import java.util.BitSet;

public class bitset1_01 {
 public static void main(String[] args) {
	 BitSet bitset1 = new BitSet(8);
	   BitSet bitset2 = new BitSet(8);
	   BitSet bitset3 = new BitSet(8);

	   // assign values to bitset1
	   bitset1.set(0);
	   bitset1.set(1);
	   bitset1.set(2);
	   bitset1.set(3);
	   bitset1.set(4);
	   bitset1.set(5);

	   // assign values to bitset2
	   bitset2.set(2);
	   bitset2.set(4);
	   bitset2.set(6);
	   bitset2.set(8);
	   bitset2.set(10);
		  
	   // print the sets
	   System.out.println("Bitset1:" + bitset1);
	   System.out.println("Bitset2:" + bitset2);
	   
	 /*  bitset1.and(bitset2);
	   System.out.println(bitset1);
	   
	   bitset1.andNot(bitset2);
	   System.out.println(bitset1);*/
	   
	   System.out.println("" + bitset1.cardinality());
	   
	   System.out.println("" + bitset2.cardinality());
	   
	  //bitset2.clear();
	 //  bitset1.flip(3);
	  // System.out.println("Bitset2:" + bitset1);
	   bitset3.set(22);
	   bitset3.set(40);
	   System.out.println("" + bitset1.intersects(bitset3));

}
}
