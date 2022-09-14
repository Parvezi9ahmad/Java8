package com.learn.java.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> mapStudent = new HashMap<String, Double>();
		students.forEach(student -> {
			if(PredicateStudentExample.p1.test(student)) {
			mapStudent.put(student.getName(), student.getGpa());
			}
		});
		return mapStudent;
	});

	public static void main(String[] args) {
		 System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

			/*
			 * Consumer<List<Student>> c1 = (students -> { students.forEach(student -> {
			 * System.out.println(student.getName()); }); });
			 * c1.accept(StudentDataBase.getAllStudents());
			 */
	}

}
