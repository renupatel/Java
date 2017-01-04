package Arrays;

public class SubsetofArray {

	public static int[] get(int[] array, int offset) {
	    return get(array, offset, array.length - offset);
	  }

	  /**
	   * Gets the subarray of length <tt>length</tt> from <tt>array</tt>
	   * that starts at <tt>offset</tt>.
	   */
	  public static int[] get(int[] array, int offset, int length) {
	    int[] result = new int[length];
	    System.arraycopy(array, offset, result, 0, length);
	    return result;
	  }
	
	public static void main(String[] args) {
		String s = "welcome";
		String s2 = "Java";
		byte[] b1 = s.getBytes();
		
		SubsetofArray a = new SubsetofArray();
		int[] inta = {1,2,5,8,9,10};
		int[] output = a.get(inta, 2);
		System.out.println(inta.length);
		System.out.println(output.length);
		System.out.println(output.getClass().getComponentType());
	}
}
