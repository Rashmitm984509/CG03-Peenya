package com.tnsif.ExceptionHandling;

public class ThrowDemo {
static void CheckAge(int age) {
	if(age<18) {
		throw new ArithmeticException("Student is not eligiable for vote");
	}
	System.out.println("Student is eligible for vote");
}
public static void main(String[] args) {
	try {
		CheckAge(4);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
}
}
