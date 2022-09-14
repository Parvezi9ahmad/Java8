package com.learn.java.NumericStream;

import java.util.stream.IntStream;

public class NumericStreamAggregationExample {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1, 32).sum();
		System.out.println(sum);
	}

}
