package com.learn.java.StreamsTerminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamPartitioningByExample {

	public static Map<Boolean, List<Student>> partitioningBy_1() {
		Map<Boolean, List<Student>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.9));
		return collect;
	}
	
	public static Map<Boolean, Set<Student>> partitioningBy_2() {
		Map<Boolean, Set<Student>> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(student->student.getGpa()>=3.9,Collectors.toSet()));
		return collect;
	}

	public static void main(String[] args) {
		/*
		 * Map<Boolean, List<Student>> partitioningBy_1 = partitioningBy_1();
		 * partitioningBy_1.forEach((k, v) -> System.out.println(k + "   " + v));
		 */
		
		System.out.println(partitioningBy_2());
	}
}
