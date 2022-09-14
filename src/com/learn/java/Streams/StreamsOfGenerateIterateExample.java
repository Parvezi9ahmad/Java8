package com.learn.java.Streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {

	public static void main(String[] args) {
		Stream<String> of = Stream.of("Adam", "Dan", "julie");
		of.forEach(System.out::println);

		Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);

		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier).limit(5).forEach(System.out::println);
	}
}
