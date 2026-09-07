package com.tnsif.ExceptionHandling;

public class Throwsdemo2 {
static void checkpassword(String Password) {
	if(Password.length()<6) {
		throw new IllegalArgumentException("Password is too Short");
	}
	System.out.println("Password accepted");
}
public static void main(String[] args) {
	try {
		checkpassword("abcgfgjfjjh");
	}
	catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}
}
