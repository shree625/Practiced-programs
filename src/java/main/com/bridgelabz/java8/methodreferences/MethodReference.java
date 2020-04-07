package com.bridgelabz.java8.methodreferences;

public class MethodReference {
	public static  void saySomething() {
		System.out.println("Example for static method reference");
	}
	
	public static void main(String[] args) {
		Sayable sayable= MethodReference::saySomething;
		sayable.say();
	}
}