package com.stat.th;
class MyThread extends Thread
{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("child thread");
		}
	}
	
}
public class PreorityTestDemo {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.setPriority(9);
		t1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

}
