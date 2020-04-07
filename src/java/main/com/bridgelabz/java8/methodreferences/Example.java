package com.bridgelabz.java8.methodreferences;
//Type2: Method reference to an instance method of an object

@FunctionalInterface 

interface MyInterface{
	void display();
}

public class Example {
public void myMethod() {
	System.out.println("Instance method");
}

public static void main(String[] args) {
	Example obj= new Example();
	MyInterface ref= obj::myMethod;
	ref.display();
}
}
