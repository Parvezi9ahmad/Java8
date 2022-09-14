package com.learn.java.StreamsTerminal;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static long sum() {
		Integer collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.summingInt(d->d.getNoteBooks()));
		return collect;
	}
	
	public static double average() {
		Double collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.averagingDouble(Student::getNoteBooks));
		return collect;
	}
	public static void main(String[] args) {
		System.out.println("Summing :"+sum());
		System.out.println("Averaging :"+average());
	}

}
