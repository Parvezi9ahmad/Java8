package com.learn.java.Streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamFlatMapExample {

	public static List<String> Listactivities() {
		List<String> collect = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		return collect;
	}
	
	public static Long getStudentAcivitiesCount() {
		long collect = StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.count();
		
		return collect;
	}

	public static void main(String[] args) {

		System.out.println("List of Activities :" + Listactivities());
		System.out.println("No of Students :" + getStudentAcivitiesCount());
	}

}
