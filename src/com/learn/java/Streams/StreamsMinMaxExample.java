package com.learn.java.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int findMaxMinValue(List<Integer> integerList) {
		Integer reduce = integerList.stream().reduce(0,(x,y)->x>y ? x:y);
		return reduce;
	}
	
	public static Optional<Integer> findMaxValueOption(List<Integer> integerList){
              Optional<Integer> reduce = integerList.stream().reduce((x,y)->x>y ?x:y);
		return reduce;
	}
	
	public static Optional<Integer> findMinValue(List<Integer> integerList) {
Optional<Integer> reduce = integerList.stream()
.reduce((x,y)->x<y ? x:y);
		return reduce;
	}
	public static void main(String[] args) {
      List<Integer> integerList=Arrays.asList(6,7,8,9,10,13,17,7);
      //List<Integer> integerList=new ArrayList<>();
		/*
		 * int findMaxMinValue = findMaxMinValue(integerList);
		 * System.out.println(findMaxMinValue); Optional<Integer> findMaxValueOption =
		 * findMaxValueOption(integerList); if(findMaxValueOption.isPresent()) {
		 * System.out.println("Max value found :"+findMaxValueOption.get()); } else {
		 * System.out.println("No Max Value"); }
		 */
      Optional<Integer> findMinValue = findMinValue(integerList);
      System.out.println(findMinValue.get());
      
	}

}
