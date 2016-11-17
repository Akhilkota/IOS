package main.akhil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fixed number of threads are processing this application
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		for(int i = 0 ; i< 50 ; i++){
			Runnable worker = new WorkerThread(""+i);
			executor.execute(worker);
			
			
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

	}

}
