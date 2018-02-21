package com.stat.th;

 class A implements Runnable
{
	int a=0;
	int b=0;

	public  void m1()
	{
		synchronized(this){
			//this.a++;
			System.out.println("-------------mA---------");
			System.out.println("Thread: " + Thread.currentThread().getName());
			System.out.println("-------------mA---------");
		}
	}
	public  void m2()
	{
		synchronized(this){
			//this.b++;
			System.out.println("---------------mB-----------");
			System.out.println("Thread: " + Thread.currentThread().getName() );
			System.out.println("---------------mB-----------");
		}
	}
	public void run() 
	{

		m1();
		System.out.println("m1() execute");

	}
 

	public static void main(String[] args) throws InterruptedException {
		A objt = new A();
		A objt1 = new A();
		Thread at = new Thread(objt);
		Thread at2 = new Thread(objt1);
		at.setName("at");
		at.setName("at2");
		at.start();
		Thread.sleep(100);
		at2.start();

		System.out.println("'main' calling metod: ");
		objt.m2();
	}
}
