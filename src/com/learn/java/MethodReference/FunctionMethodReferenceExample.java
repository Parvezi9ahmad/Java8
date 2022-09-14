package com.learn.java.MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String,String> toUpperCaselambda=(s)->s.toUpperCase();
	static Function<String,String> toMethodReference=String::toUpperCase;
	public static void main(String[] args) {

		System.out.println(toUpperCaselambda.apply("java8"));
		
		System.out.println(toMethodReference.apply("java17"));
	}

}
