package com.learn.java.MethodReference;

import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class RefactormethodreferenceExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() == 3;
	static Predicate<Student> p2=RefactormethodreferenceExample::greaterThanGradeLevel;

	public static Boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {

		System.out.println(p2.test(StudentDataBase.studentSupplier.get()));
		
	}

}
