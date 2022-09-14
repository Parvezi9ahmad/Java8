package com.learn.java.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class ConsumerExample {
	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

	public static void PrintName() {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach(c2);
		// System.out.println(c2);
	}

	public static void printNamesAndActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c3.andThen(c4));// consumer chaining
	}
	
	public static void printNamesAndActivitiesUsingCondition() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((student->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
			}
			c3.andThen(c4).andThen(c2).accept(student);
		}));
	}

	/*
	 * public static void printNamesAndActivitiesusingcondition() {
	 * 
	 * List<Student> studentList = StudentDataBase.getAllStudents();
	 * studentList.forEach((Student -> { if (Student.getGradeLevel() >= 3 &&
	 * Student.getGpa()>=3.9) { c3.andThen(c4).accept(Student); } })); }
	 */

	public static void main(String[] args) {

		Consumer<String> c = (a) -> System.out.println(a.toUpperCase());
		c.accept("java 8");
		// PrintName();
		// printNamesAndActivities();
		printNamesAndActivitiesUsingCondition();
	}

}
