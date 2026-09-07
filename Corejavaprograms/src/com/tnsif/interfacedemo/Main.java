package com.tnsif.interfacedemo;

interface Payment{
	void pay(double amount);  //abstract method
	void checkStatus();
}
class UPI implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+" Using upi");
	}
	@Override
	public void checkStatus() {
		System.out.println("upi payment successfully");		
	}
}

public class Main {
public static void main(String[] args) {
	UPI u=new UPI();
	u.pay(1500.90);
	u.checkStatus();
}
}
