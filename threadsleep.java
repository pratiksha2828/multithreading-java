package com.edu;
class mythreads extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class threadsleep {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		mythreads t1= new mythreads();
		t1.start();
	}

}
