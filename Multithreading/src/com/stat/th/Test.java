package com.stat.th;

public class Test extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			
			System.out.println("run method called");
		}
	}
}


