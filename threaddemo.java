package com.edu;
class MyRunnable implements Runnable{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}
}
public class threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable t1= new MyRunnable();
		Thread ob= new Thread(t1);
		ob.start();
		MyRunnable t2= new MyRunnable();
		Thread ob1= new Thread(t2);
		ob1.start();
		try {
			ob.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
