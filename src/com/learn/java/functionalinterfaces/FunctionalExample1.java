package com.learn.java.functionalinterfaces;

public class FunctionalExample1 {
	

	public static String PerformConcate(String str) {
		return FunctionExample.addSomething.apply(str);
		
	}
	public static void main(String[] args) {

		String result = PerformConcate("Hello");
		System.out.println("result :"+result);
	}

}
