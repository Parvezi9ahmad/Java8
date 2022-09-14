package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		Comparator<Integer> comparator=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}};
			System.out.println("Result for comparator :"+comparator.compare(3, 4));
			
			Comparator<Integer> comparator1=(Integer a,Integer b)-> a.compareTo(b);
			System.out.println("Result from lambda :"+comparator1.compare(3, 4));
			
			Comparator<Integer> comparator2=(a,b)->a.compareTo(b);
			System.out.println("Result from lambda latest :"+comparator2.compare(3, 4));
			
	}

}
