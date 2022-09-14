package com.learn.java.NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
	
	public static int SumOfNumbers(List<Integer> integerList) {
		Integer reduce = integerList.stream().reduce(0,(x,y)->x+y);
		return reduce;
	}
	
	public static int SumOfNumberIntStream(List<Integer> integerList) {
		int sum = IntStream.rangeClosed(1, 6).sum();
		return sum;
	}

	public static void main(String[] args) {

		List<Integer> integerList=Arrays.asList(1,2,3,4,5,6);
		System.out.println(SumOfNumbers(integerList));
		System.out.println(SumOfNumberIntStream(integerList));
	}

}
