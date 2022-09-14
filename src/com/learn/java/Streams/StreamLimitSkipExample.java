package com.learn.java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integerList){
		Optional<Integer> reduce = integerList.stream()
		.limit(2).reduce((x,y)->x+y);
		return reduce;
	}
	
	public static Optional<Integer> skipp(List<Integer> integerList){
		Optional<Integer> reduce = integerList.stream()
		.skip(3).reduce((x,y)->x+y);
		return reduce;
	}
	
	public static void main(String[] args) {
       List<Integer> integerList=Arrays.asList(6,7,8,9,10);
       Optional<Integer> limit = limit(integerList);
       System.out.println(limit.get());
       Optional<Integer> skipp = skipp(integerList);
       if(skipp.isPresent()) {
    	   System.out.println(skipp.get());
       }
       else {
    	   System.out.println("Number is not found");
       }
	}

}
