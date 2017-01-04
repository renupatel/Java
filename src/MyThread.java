
public  class MyThread {

	
	
	/*public static class myt extends Thread{
		
		public myt(String name){
			super(name);
			
		}
		
		@Override
		public void run(){
			System.out.println(Thread.currentThread().getName());
			
		}
	}*/
	
	public static void main(String[] args) {

	 /*myt m = new myt("test");
	 m.run();
	 m.start();*/
		
		
		int[] intArray={1,5,6,7,8,1,5,8};

	        for (int i = 0; i < intArray.length; i++) {
	            for (int j = i + 1; j < intArray.length; j++) {
	                if (intArray[i] == intArray[j]) {                  
	                    int shiftLeft = j;

	                    for(int k = j + 1; k < intArray.length; k++, shiftLeft++) {
	                    	intArray[shiftLeft] = intArray[k];
	                    }

	                    intArray.length--;
	                    j--;
	                }
	            }
	        }

	        int[] whitelist = new int[intArray.length];

	        for (int i = 0; i < intArray.length; i++) {
	            whitelist[i] = intArray[i];
	            System.out.println(whitelist[i]);
	        }

	    }
	}

}
