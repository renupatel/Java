
public class Thread001 implements Runnable {
	
	private String tname;
	
	
	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Thread001(String tname) {

		this.tname = tname;
	}
	public void print(){

		System.out.println("======== current runnint thread is" + tname);
		
		for(int i = 0;i<=10; i++){
			System.out.println("thread 001 == "+ tname +"  "+ i);
		 
		}
	}
	
	public void run() {
	
		print();
	}

}
