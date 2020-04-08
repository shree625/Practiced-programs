package com.bridgelabz.java8.defaultmethods;

interface Sayable{    
    // default method    
    default void say(){    
        System.out.println("Hello, this is default method");    
    }    
    // Abstract method    
    void sayMore(String msg);    
    // static method    
    static void sayLouder(String msg){    
        System.out.println(msg);    
    }    
}    
public class Example3 implements Sayable{
	    
	    public void sayMore(String msg){     // implementing abstract method    
	        System.out.println(msg);    
	    }    
	    public static void main(String[] args) {    
	       Example3 dm = new Example3();    
	        dm.say();                       // calling default method    
	        dm.sayMore("Work is worship");      // calling abstract method    
	        Sayable.sayLouder("Helloooo...");   // calling static method    
	    }    
	}    


