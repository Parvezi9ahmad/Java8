package com.learn.java.StreamsTerminal;

import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsJoiningExample {

	public static String joining1() {
		String collect = StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.joining());
		return collect;
	}
	
	public static String joining2() {
		String collect = StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.joining("-"));
		return collect;
	}
	
	public static String joining3() {
		String collect = StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.joining("-", "(", ")"));
		return collect;
	}
	public static void main(String[] args) {
		System.out.println("joining1 :"+joining1());
		System.out.println("Joining2 :"+joining2());
		System.out.println("Joining3 :"+joining3());
	}

}
