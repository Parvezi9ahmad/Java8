package com.learn.java.Streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamFIlterExample {

	public static List<Student> filterStudents(){
		List<Student> collect = StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGender().equals("female"))
		.collect(Collectors.toList());
		return collect;
		
	}
	public static void main(String[] args) {

    //System.out.println("FilterStudents :"+filterStudents());
	filterStudents().forEach(System.out::println);
	}
}
