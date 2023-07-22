package com.gurukul.day5;

import java.util.Scanner;

class Bank
{
	private String name,branchName;
	private int accountNo;
	double balance;
	private static int count=1000;
	private static double total=0;
	
	Bank()
	{
		Bank.count++;
	}
	
	Bank(String name, String branchName, double balance)
	{
		this.name=name;
		this.branchName=branchName;
		this.balance=balance;
		Bank.count++;
		accountNo = count;
		total = total + balance;
	}

	public double getBalance() {
		return balance-1000;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getBranchName() {
		return branchName;
	}

	public int getAccountNo() {
		return accountNo;
	}
	
	double deposit(double amt)
	{
		
		balance = balance + amt;
		total = total + amt;
		return balance;
	}
	
	double withdraw(double amt)
	{
		double a = balance-amt;
		if(a>=1000)
		{
			balance = a;
			total = total - amt;
		}
		return balance;
	}
	
	public String toString()
	{
		return "\nName: "+name+" Account No: "+accountNo+" Balance: "+balance+" Branch: "+branchName;
	}
	
	static double getTotal()
	{
		return total;
	}
	
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner sc = new Scanner(System.in);
		Bank acc1=new Bank("Ram", "Bandra", 2500);
		
		acc1.deposit(2550);
		
		double bal=acc1.getBalance();
		
		System.out.println(acc1.getName()+" has available "+ bal+" amount");
				// Ram has 4050 amount
		
		System.out.println("Enter the amount to withdraw");
		double am=sc.nextDouble();//4500
		
		if(acc1.getBalance()>=am)
		
		acc1.withdraw(am);
		else
			
		System.out.println("Insufficient fund"); //output .because Minimum balance 1000
		
		
		System.out.println("Details of the account holder"+ acc1);
		
		// Name: Ram Account Number 123456   Balance Rs.5050 Branch: Bandra 

		
       Bank  acc2=new Bank("Sita", "Bandra", 2000);
		
		acc2.deposit(2550);
		
		double bal2=acc2.getBalance();
		
		System.out.println(acc2.getName()+" has available "+ bal2+" amount");
				// Sita has 4050 amount
		
		System.out.println("Enter the amount to withdraw");
		double am2=sc.nextDouble();//2500
		
		if(acc2.getBalance()>am2)
		
		acc2.withdraw(am2);
		else
			
		System.out.println("Insufficient fund"); 
		
		System.out.println("Details of the account holder"+ acc2);
		
		// Name: Sita Account Number 23456   Balance Rs.1550 Branch: Bandra 				*/
		
		Bank acc1 = new Bank("Ram","Bandra",2500);
		Bank acc2 = new Bank("Sita","Bandra",3500);
		Bank acc3 = new Bank("Rahim","Bandra",2800);
		Bank acc4 = new Bank("Rita","Bandra",5500);
		
		acc1.deposit(5000);
		acc2.deposit(2500);
		acc3.withdraw(1200);
		System.out.println(acc1);
		//Name: Ram Account Number 1001   Balance Rs.7500 Branch: Bandra 
		System.out.println(acc2);
		//Name: Sita Account Number 1002   Balance Rs.6000 Branch: Bandra 

		System.out.println(acc3);
		//Name: Rahim Account Number 1003   Balance Rs.1600 Branch: Bandra 
		System.out.println(acc4);
		//Name: Rita Account Number 1004   Balance Rs.5500 Branch: Bandra 
		
		System.out.println("Amount available in bank: "+Bank.getTotal());
		
	}

}
