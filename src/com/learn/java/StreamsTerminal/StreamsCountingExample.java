package com.learn.java.StreamsTerminal;

import java.util.stream.Collectors;

import com.learn.java.data.StudentDataBase;

public class StreamsCountingExample {

	public static long count() {
		Long collect = StudentDataBase.getAllStudents().stream()
				.filter(student->student.getGpa()>=3.9)
		.collect(Collectors.counting());
		return collect;
	}
	public static void main(String[] args) {
       System.out.println("count :"+count());
	}

}
