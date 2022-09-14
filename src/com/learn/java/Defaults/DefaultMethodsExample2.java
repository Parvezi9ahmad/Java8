package com.learn.java.Defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class DefaultMethodsExample2 {

	static Consumer<Student> studentConsumer = (Student -> System.out.println(Student));
	static Comparator<Student> nameComparator=Comparator.comparing(Student::getName);
	static Comparator<Student> gradeComparator=Comparator.comparing(Student::getGradeLevel);

	public static void sortByName(List<Student> studentList) {
		System.out.println("After Sorting....");
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}

	public static void sortByGpa(List<Student> studentList) {
		System.out.println("After Sorting 1");
        Comparator<Student> comparing = Comparator.comparing(Student::getGpa);
        studentList.sort(comparing);
        studentList.forEach(studentConsumer);
	}

	public static void ComparatorChaining(List<Student> studentList) {
	    System.out.println("After comparatorChaining");	
	    studentList.sort(gradeComparator.thenComparing(nameComparator));
	    studentList.forEach(studentConsumer);
	}
	
	public static void sortWithNullValues(List<Student> studentList) {
		Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);
	}
	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		// System.out.println(allStudents);
		// studentList.forEach(s -> System.out.println(s));
		//sortByName(studentList);
		//sortByGpa(studentList);
		//ComparatorChaining(studentList);
		sortWithNullValues(studentList);
	}

}
