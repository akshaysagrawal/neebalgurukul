package com.gurukul.day10;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++)
				{
					System.out.print("/");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						 //TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
			t1.start();
		
				for(int i=1;i<=10;i++)
				{
					System.out.print("*");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
	}

}
