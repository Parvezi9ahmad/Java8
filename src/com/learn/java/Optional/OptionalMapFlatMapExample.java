package com.learn.java.Optional;

import java.util.List;
import java.util.Optional;

import com.learn.java.data.Bike;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class OptionalMapFlatMapExample {

	public static void OptionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(student->student.getGpa()>=4.0)
		.ifPresent(s->System.out.println(s));
	}
	public static void OptionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(s->s.getGpa()>=3.5)
		.map(student->student.getName()).ifPresent(student->System.out.println(student));
	}
	
	public static void OptionalFlatMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		optionalStudent.filter(student->student.getGpa()>=3.5)
		.flatMap(Student::getBike)
		.map(Bike::getName).ifPresent(s->System.out.println("name :"+s));
	
	}
	
	public static void main(String[] args) {
		OptionalFilter();
		OptionalMap();
		OptionalFlatMap();
	}

}
