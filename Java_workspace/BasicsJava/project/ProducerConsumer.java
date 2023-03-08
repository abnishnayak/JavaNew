package project;

import java.util.LinkedList;
import java.util.Queue;
public class ProducerConsumer {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Queue<Integer>sharedQueue=new LinkedList<>();
		Producer producer=new Producer();
		Consumer consumer=new Consumer();
		
		Thread producerThread=new Thread(producer);
		producerThread.start();
		Thread consumerThread=new Thread(consumer);
		consumerThread.start();
	}

}
