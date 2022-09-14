package com.learn.java.StreamsTerminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy_example() {
		Optional<Student> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
		return collect;
	}

	public static Optional<Student> maxBy_example() {
		Optional<Student> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		return collect;
	}

	public static void main(String[] args) {
		System.out.println(minBy_example());
		System.out.println(maxBy_example());
	}

}
