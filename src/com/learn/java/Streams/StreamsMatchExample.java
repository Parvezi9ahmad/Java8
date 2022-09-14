package com.learn.java.Streams;

import com.learn.java.data.StudentDataBase;

public class StreamsMatchExample {

	public static Boolean allMatch() {
		boolean allMatch = StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.9);
		return allMatch;
	}

	public static Boolean anyMatch() {
		boolean anyMatch = StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.0);
		return anyMatch;
	}
	public static Boolean nonMatch() {
		boolean noneMatch = StudentDataBase.getAllStudents().stream()
		.noneMatch(student->student.getGpa()>=3.9);
		return noneMatch;
	}

	public static void main(String[] args) {

		System.out.println("Result of all match :" + allMatch());
		System.out.println("Result of AnyMatch :" + anyMatch());
		System.out.println("Result of nonmatch :"+nonMatch());
	}

}
