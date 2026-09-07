package com.tnsif.ExceptionHandling;

public class Finallydemo {
public static void main(String[] args) {
	try {
		System.out.println(6/0);
	}
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println(f);
	}
	finally {
		System.out.println("welcome to java");
	}
}
}
