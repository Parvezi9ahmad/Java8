package com.learn.java.ParallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class ParallelStreamExample1 {

	public static List<String> sequentialPrintStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> collect = StudentDataBase.getAllStudents().stream()
		.map(Student::getActivities)
		.flatMap(List->List.stream())
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute sequential :"+(endTime-startTime));
		return collect;
	}
	
	public static List<String> ParallelPrintStudentActivities(){
		long startTime = System.currentTimeMillis();
		List<String> collect = StudentDataBase.getAllStudents().stream()
		.parallel()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Duration to execute parallel :"+(endTime-startTime));
		return collect;
	}
	public static void main(String[] args) {
       System.out.println(sequentialPrintStudentActivities());
       System.out.println(ParallelPrintStudentActivities());
	}

}
