package com.learn.java.Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMapExample {

	public static List<String> nameList() {
		List<String> collect = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toList());
		return collect;
	}
	
	public static Set<String> nameSet() {
		Set<String> collect = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toSet());
		return collect;
	}

	public static void main(String[] args) {

		System.out.println(nameList());
		System.out.println(nameSet());
	}

}
