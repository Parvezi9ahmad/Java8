package com.learn.java.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class PredicateAndConsumerExample {
	
	Predicate<Student> p1=(Student)->Student.getGradeLevel()>=3;
	Predicate<Student> p2=(Student)->Student.getGpa()>=3.9;
	
	//BiConsumer<Student,Student> studentBiConsumer=(s1,s2)->System.out.println(s1.getName()+ "   "+s2.getActivities());
	//BiPredicate<Student,Student> biPredicate=(s1,s2)->s1.getGradeLevel()>=3&&s2.getGpa()>=3.9;
	
	BiPredicate<Integer,Double> biPredicate=(gradeLevel,Gpa)->gradeLevel>=3&&Gpa>=3.9;
	
	BiConsumer<String,List<String>> studentBiConsumer=(name,activities)->System.out.println(name+"     "+activities);
	
	Consumer<Student> StudentConsumer=(student->{
		if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
			//studentBiConsumer.accept(student,student);
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	});
	
	public void PrintNameAndActivities(List<Student> allStudents) {
		allStudents.forEach(StudentConsumer);
	}

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().PrintNameAndActivities(allStudents);
	}

}
