package com.learn.java.MethodReference;

import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> c1=(s)->System.out.println(s);
	
	static Consumer<Student> c2=System.out::println;
	
	static Consumer<Student> c3=Student::printListOfActivities;
	public static void main(String[] args) {

		//StudentDataBase.getAllStudents().forEach(c1);
		//StudentDataBase.getAllStudents().forEach(c2);
		StudentDataBase.getAllStudents().forEach(c3);
	}

}