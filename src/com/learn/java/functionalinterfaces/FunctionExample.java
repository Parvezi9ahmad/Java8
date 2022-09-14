package com.learn.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String,String> function=(name)->name.toUpperCase();
	
	static Function<String,String> addSomething=(name)->name.toUpperCase().concat("default");

	public static void main(String[] args) {

		System.out.println("Result is :"+function.apply("java"));
		
		System.out.println("Result for andthen :"+function.andThen(addSomething).apply("java8"));
		
		System.out.println("Result for compose :"+function.compose(addSomething).apply("java8"));
	}

}
