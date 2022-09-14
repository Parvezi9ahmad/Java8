package com.learn.java.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionvsStream {

	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<String>();
		names.add("Adam");
		names.add("jim");
		names.add("jenny");
		/*
		 * names.remove(0); System.out.println(names);
		 */
		
		for(String name:names) {
			System.out.println(name);
		}
		for(String name:names) {
			System.out.println(name);
		}
		names.remove(0);
		System.out.println(names);
		
		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
		
		//stream.forEach(System.out::println);
	}

}
