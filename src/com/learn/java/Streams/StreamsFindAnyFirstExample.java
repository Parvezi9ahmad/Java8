package com.learn.java.Streams;

import java.util.Optional;
import java.util.stream.Stream;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAny(){
		Optional<Student> findAny = StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGpa()>=4.1)
		.findAny();
		return findAny;
	}
	public static Optional<Student> findAnd(){
		Optional<Student> findFirst = StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGpa()>=4.1)
		.findFirst();
		return findFirst;
	}
	public static void main(String[] args) {
		Optional<Student> findAny = findAny();
           if(findAny.isPresent()) {
        	   System.out.println("Student is present :"+findAny.get());
           }
           else {
        	   System.out.println("Student is not present");
           }
           
           Optional<Student> findAnd = findAnd();
           if(findAnd.isPresent()) {
        	   System.out.println("Student is present :"+findAnd.get());
           }
           else {
        	   System.out.println("Student is not present");
           }
	}

}
