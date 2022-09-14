package com.learn.java.StreamsTerminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsMappingExample {

	public static List<Object> mapStream() {
		List<Object> collectData = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.mapping(student->student.getName(), Collectors.toList()));
		return collectData;
	}
	
	public static Set<String> nameset() {
		Set<String> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		return collect;
	}
	
	public static List<String> nameList() {
		List<String> collect = StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.collect(Collectors.toList());
		
		return collect;
	}
	public static void main(String[] args) {

		System.out.println("mapStream :"+mapStream());
		System.out.println("nameset :"+nameset());
		System.out.println("NameList :"+nameList());
	}

}
