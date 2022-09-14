package com.learn.java.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class PredicateStudentExample {

	// static Predicate<Integer> p1=(s)->s>=3;
	/*
	 * public static void filterStudentByGradeLevel() { List<Student> allStudents =
	 * StudentDataBase.getAllStudents(); allStudents.forEach((student->{
	 * if(p1.test(student.getGradeLevel())) { System.out.println(student); } })); }
	 */

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2=(s)->s.getGpa()>=3.9;

	public static void filterStudentByGradeLevel() {
		System.out.println("Filtered Student by Gradlevel");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach((student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		}));

	}
	
	public static void FilterStudentByGpa() {
		System.out.println("Filtered Student By Gpa");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach((s->{
			if(p2.test(s)) {
				System.out.println(s);
			}
		}));
	}

	public static void FilteredByStudents() {
		System.out.println("Filtered By Student");
		List<Student> allStudents = StudentDataBase.getAllStudents();
		allStudents.forEach((Student->{
			if(p1.or(p2).negate().test(Student)) {
				System.out.println(Student);
			}
			else {
				System.out.println(Student);
			}
		}));
		
	}
	public static void main(String[] args) {
		filterStudentByGradeLevel();
		FilterStudentByGpa();
		FilteredByStudents();
	}

}
