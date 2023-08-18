package com.gurukul.day10;

class Bank{
	
	String name;
	double amount;
	Bank(String n, double d){
	name=n;
	amount=d;
	
	}
	synchronized void deposit(double am) {
		System.out.println("Came to deposit"+this);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		amount+=am;
		System.out.println("finish deposit"+this);
	}
	synchronized void withdraw(double am) {
		amount-=am;
	}
	public String toString() {
		return name+" "+ amount;
	}
}

class BankThread extends Thread{
	String operation;
	Bank acc;
	double amount;
	BankThread(String op, Bank obj, double amount){
		operation=op;
		acc=obj;
		this.amount=amount;
		start();
	}
	public void run() {
		//synchronized(acc) {
		System.out.println("[");
		if(operation.equals("deposit"))
		{
			acc.deposit(amount);
		}
		else {
			acc.withdraw(amount);
		}
		
		System.out.println("]");
		//}
	}
	

}
public class BankThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Bank x=new Bank("Ravi",20000);
		Bank y=new Bank("Vishnu", 10000);
		
		BankThread b1=new BankThread("deposit", x,5000);
		BankThread b2=new BankThread("with", y,2500);
		BankThread b3=new BankThread("with", x,2500);
		
		b1.join();
		b2.join();
		System.out.println(x);

		System.out.println(y);
		

	}

}
