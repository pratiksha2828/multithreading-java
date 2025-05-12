package com.edu;

class mythread1 extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}
}
public class mythread {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		mythread1 t1= new mythread1();
		t1.start();
		mythread1 t2= new mythread1();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
