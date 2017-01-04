
public class Test {

	public static void main(String arg[]){
		
		Thread001 t1 = new Thread001("runnin1");
		
		Thread T1 = new Thread(t1);
		Thread0002 t2 = new Thread0002();
		Thread T2 = new Thread(t2);
		
		System.out.println(T1.currentThread().getName());
		System.out.println("Thread 02"+T2.getName());
		
		Thread001 t3 = new Thread001("runnin2");
		Thread T3 = new Thread(t3);
		T1.start();
		T3.start();
		/*try {
			T1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		T2.start();
				
	}
}
