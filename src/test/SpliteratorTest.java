package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Spliterator;

public class SpliteratorTest implements Runnable{

	//并行迭代器，为了应对并行迭代的场景，可以在多线程的情况下迭代同一个hashmap，但官方建议一个
	//迭代器只和一个线程结合使用
	Spliterator<Integer> spliterator;
	Spliterator<Entry<Integer, Integer>> spliterator2;
	String threadName;
	
	SpliteratorTest(Spliterator<Integer> spliterator,String threadName){
		this.spliterator = spliterator;
		this.threadName = threadName;
	}
	
	SpliteratorTest(String threadName,Spliterator<Entry<Integer, Integer>> spliterator2){
		this.spliterator2 = spliterator2;
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		spliterator.forEachRemaining(s -> {
			System.out.println(threadName + " = "+s);
		});
	}
	
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i < 23;i ++) {
			map.put(i, i);
		}
		
		Spliterator<Entry<Integer, Integer>> s1 = map.entrySet().spliterator();
//		Spliterator<Integer> s1 = map.values().spliterator();值
//		Spliterator<Integer> s1 = map.keySet().spliterator();键
//		Spliterator<Integer> s2 = s1.trySplit();
//		Spliterator<Integer> s3 = s2.trySplit();
		Spliterator<Entry<Integer, Integer>> s2 = s1.trySplit();
		Spliterator<Entry<Integer, Integer>> s3 = s2.trySplit();
		
		Thread t1 = new Thread(new SpliteratorTest("线程1",s1));
		Thread t2 = new Thread(new SpliteratorTest("线程2",s2));
		Thread t3 = new Thread(new SpliteratorTest("线程3",s3));
		
		//使用entrySet时，出现一个空指针
		t1.run();
//		t1.start();
//		t2.start();
//		t3.start();
	}

}
