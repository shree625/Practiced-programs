package com.bridgelabz.java8.methodreferences;


@FunctionalInterface
interface Counter{
	int count(Object[] objArray);
	}

class Utils {
	public int count(Object[] array) {
		return array.length;
	}
	public static void main(String[] args) {
		Counter counter1= new Utils()::count;
	}

}
