package com.learn.java.Streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {
		// student name and activities in tomap
		
		Predicate<Student> studentPredicate=(student)->student.getGradeLevel()>=3;
		Predicate<Student> studentGpaPredicate=(student)->student.getGpa()>=3.9;
		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.peek(student->System.out.println(student))
				.filter(student->student.getGradeLevel()>=3)
				.peek(student->System.out.println("After 1st filter :"+student))
				.filter(student->student.getGpa()>=3.9)
				.peek(student->System.out.println("after second filter :"+student))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);
	}

}
