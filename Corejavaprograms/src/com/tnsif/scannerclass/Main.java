package com.tnsif.scannerclass;

import java.util.Scanner;

// demo for scanner class
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name :");
		String name=sc.nextLine();
		
		System.out.println("enter the age :");
		int age=sc.nextInt();
		
		System.out.println("enter the salary :");
		double salary=sc.nextDouble();
		
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Salary "+salary);
	}

}
