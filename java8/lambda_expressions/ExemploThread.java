package lambda_expressions;

public class ExemploThread {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 execute!");
				
			}
		});
		t1.start();
		
		Thread t2 = new Thread(() -> System.out.println("Thread 2 execute!"));
		t2.start();
		
	}
	
}
