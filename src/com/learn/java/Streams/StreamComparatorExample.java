package com.learn.java.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamComparatorExample {

	public static List<Student> sortStudentByName(){
		List<Student> collect = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(student->student.getName()))
		.collect(Collectors.toList());
		return collect;
		
	}
	public static List<Student> sortStudentByGpa(){
		List<Student> collect = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(student->student.getGpa()))
		.collect(Collectors.toList());
		return collect;
	}
	
	public static List<Student> sortGpaByDesc(){
		List<Student> collect = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
		return collect;
	}
	
	public static void main(String[] args) {

		System.out.println(sortStudentByName());
		System.out.println(sortStudentByGpa());
		System.out.println(sortGpaByDesc());
	}

}
