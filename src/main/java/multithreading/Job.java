package multithreading;

import java.util.Arrays;
import java.util.List;

public class Job {
	
	private final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	
	public void run() {
		theLambdaThread();
	}
	
	public void theLambdaThread() {
		new Thread(() -> {
			for (Integer i : numbers) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Lambda Thread: "+ i);
			}
		}).start();
	}

}
