package com.learn.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
static int value=10;
	public static void main(String[] args) {

		
		Consumer<Integer> c2=(i)->{
			value++;
			System.out.println(value+i);
		};
		c2.accept(4);
	}

}
