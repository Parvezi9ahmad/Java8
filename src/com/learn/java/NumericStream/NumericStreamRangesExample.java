package com.learn.java.NumericStream;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {

	public static void main(String[] args) {
          IntStream range = IntStream.range(1, 50);
          System.out.println(range.count());
          IntStream.range(1, 50).forEach(s->System.out.println(s+","));
          
          long count = IntStream.rangeClosed(1, 50).count();
          System.out.println(count);
          
          IntStream.rangeClosed(1, 50).forEach(s->System.out.println(s));
	}

}
