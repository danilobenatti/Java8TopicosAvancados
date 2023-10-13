package lambda_expressions;

public class ExemploThread {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 execute!");
				
			}
		});
		thread1.run();
		
		Thread thread2 = new Thread(
				() -> System.out.println("Thread 2 execute!"));
		thread2.run();
		
		Thread thread3 = new Thread(
				() -> System.out.println("Thread 3 execute!"));
		thread3.start();
	}
	
}
