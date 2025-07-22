package thread;


class MyTask extends Thread  {
	
	public void run() {
	
	for (int i=1 ; i<=10 ; i++ ) {
			
		System.out.println("printing Document #"+i+" ##printer of main thread##");	
		}
	}
}
	
public class Test {
	
	// main method represents main thread 
	public static void main(String[] args) {
		// whatever we write here will executed by main thread
		System.out.println("---->App started");
		
		for (int i=1 ; i<=10 ; i++ ) {
			
			System.out.println("printing Document #"+i+" ##printer of main thread##");
		}
		
		System.out.println("---->App ended");
	}

}
