package com.learn.java.NumericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	public static List<Integer> mapToObj() {
		List<Integer> collect = IntStream.rangeClosed(1, 5)
		.mapToObj((i)->{return new Integer(i);})
		.collect(Collectors.toList());
		return collect;
	}
	
	public static long mapToLong() {
		long sum = IntStream.rangeClosed(1, 5)
		.mapToLong((i)->i)
		.sum();
		return sum;
	}
	public static Double maptoDouble() {
		double sum = IntStream.rangeClosed(1, 5)
		.mapToDouble((i)->i)
		.sum();
		return sum;
	}
	
	public static void main(String[] args) {
      System.out.println("MaptoObj :"+mapToObj());
      System.out.println("MapToLong :"+mapToLong());
	  System.out.println("maptodouble :"+maptoDouble());
	}

}
