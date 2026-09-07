package com.tnsif.ExceptionHandling;

public class WithoutException {
public static void main(String[] args) {
	
	System.out.println("Good morning all");
	int a=90;
	int b=0;
	System.out.println("welcome to java");
	try {
	System.out.println(a/b);
	}
	catch(Exception r) {
		System.out.println(r);
	}
	System.out.println("Hello world");

}
}