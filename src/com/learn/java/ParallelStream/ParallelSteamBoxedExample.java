package com.learn.java.ParallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelSteamBoxedExample {

	public static int sequentialSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		Integer reduce = integerList.stream()
		.reduce(0,(x,y)->x+y);
		long endtime = System.currentTimeMillis();
		System.out.println("Sequential Stream :"+(endtime-startTime));
		return reduce;
	}
	
	public static int ParallelStream(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		Integer reduce = integerList.stream()
		.parallel()
		.reduce(0,(x,y)->x+y);
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel Stream :"+(endTime-startTime));
		return reduce;
	}
	public static void main(String[] args) {
     List<Integer> collect = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());
	 sequentialSum(collect);
	 ParallelStream(collect);
	}
}
