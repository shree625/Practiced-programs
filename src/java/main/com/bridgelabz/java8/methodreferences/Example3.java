package com.bridgelabz.java8.methodreferences;

import java.util.Arrays;

public class Example3 {
public static void main(String[] args) {
	String[] stringArray= {"anu","kavya","handsome","naresh","divya"};
	Arrays.sort(stringArray, String::compareToIgnoreCase);
	for(String str:stringArray) {
		System.out.println(str);
	}
}
}
