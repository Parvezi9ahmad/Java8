package com.learn.java.Optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {

		//ispresent
		Optional<String> ofNullable = Optional.ofNullable(null);
		System.out.println(ofNullable.isPresent());
		/*
		 * if(ofNullable.isPresent()) { System.out.println(ofNullable.get()); } else {
		 * throw new RuntimeException(); }
		 */
		
		//isPresent
	    ofNullable.ifPresent(s->System.out.println(s));	
	}
}
