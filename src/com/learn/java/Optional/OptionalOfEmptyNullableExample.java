package com.learn.java.Optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	public static Optional<String> ofNullable() {
		Optional<String> ofNullable = Optional.ofNullable("Hello");
		return ofNullable;
	}

	public static Optional<String> of(){
		Optional<String> of = Optional.of("Hello");
		return of;
	}
	
	public static Optional<String> empty(){
		return Optional.empty();
	}
	public static void main(String[] args) {
        System.out.println("ofNullable :"+ofNullable());
        System.out.println("Of :"+of());
        System.out.println("empty :"+empty());
	}

}
