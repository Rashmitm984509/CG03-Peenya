package com.tnsif.Constructorprogram;

class Employee{
	String name;
	int salary;
	
	//Default constuctor 
	Employee(){
		name="Unknown";
		salary=45000;
	}
	void display() {
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
}
public class Constructordemo {
public static void main(String[] args) {
	Employee e=new Employee();
	e.display(); 
}
}
