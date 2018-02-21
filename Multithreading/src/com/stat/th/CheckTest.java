package com.stat.th;

class CheckTest {
	public static void main(String[] args) {
		Test t = new Test();
		Thread t1 = new Thread(t);
		//t1.setPriority(4);
		t1.start();
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Main method called");
		}
	}
}