package com.learn.java.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p = (i) -> {
		return i % 2 == 0;
	};

	static Predicate<Integer> p1 = (i) -> i % 2 == 0;

	static Predicate<Integer> p2 = (i) -> i % 5 == 0;
	
	public static void PredicateAnd() {
		System.out.println("Predicate And Result :"+p1.and(p2).test(10));
		System.out.println("Predicate And Result :"+p1.and(p2).test(8));
	}
	
	public static void PredicateOr() {
		System.out.println("Predicate Or Result :"+p1.or(p2).test(10));
		System.out.println("Predicate Or Result :"+p1.or(p2).test(8));
	}
	
	public static void PredicateNegate() {
		System.out.println("Predicate Negate :"+p1.and(p2).test(10));
		System.out.println("Predicate Negate :"+p1.or(p2).negate().test(8));
	}

	public static void main(String[] args) {

		System.out.println(p.test(4));

		System.out.println(p1.test(6));
		PredicateAnd();
		PredicateOr();
		PredicateNegate();
	}

}
