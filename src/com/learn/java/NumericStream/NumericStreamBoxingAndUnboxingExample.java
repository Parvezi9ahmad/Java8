package com.learn.java.NumericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingAndUnboxingExample {

	public static List<Integer> Boxing(){
       List<Integer> collect = IntStream.rangeClosed(1, 50)
       .boxed().collect(Collectors.toList());
		return collect;
	}
	
	public static int unBoxing(List<Integer> integerList) {
		int sum = integerList.stream()
		.mapToInt(Integer::intValue).sum();
		return sum;
	}
	public static void main(String[] args) {

		System.out.println("Boxing : "+Boxing());
		List<Integer> boxing = Boxing();
		System.out.println("Unboxing :"+unBoxing(boxing));
		
	}

}
