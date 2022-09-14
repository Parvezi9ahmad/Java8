package com.learn.java.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryoperatorExample {

	static UnaryOperator<String> unaryOperator=(s)->s.concat(" default");
	public static void main(String[] args) {

		System.out.println(unaryOperator.apply("java8"));
	}

}
