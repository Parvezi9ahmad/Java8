package com.learn.java.functionalinterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> biFunction=((students,predicate)->{
		Map<String,Double> studentGrademap=new HashMap<String,Double>();
		students.forEach(student->{
			if(predicate.test(student)) {
				studentGrademap.put(student.getName(), student.getGpa());
			}
		});
		return studentGrademap;
	});
	
	public static void main(String[] args) {
     System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p2));
       
       List<Student> allStudents = StudentDataBase.getAllStudents();
       
       BiFunction<Student,Predicate,Set<Student>> bifunc=((student,predicate)->{
    	   Set<Student> std=new HashSet<Student>();
    	  // Map<String,Double> std=new HashMap<String,Double>();
    	   if(predicate.test(student)) {
    		 //std.put(student.getName(), student.getGpa());
    		   std.add(student);
    	   }
    	   return std;
       });
       allStudents.forEach(student->{
    	 //   biFunction.apply(allStudents, PredicateStudentExample.p1);
    	  System.out.println(bifunc.apply(student, PredicateStudentExample.p2));
       });
    
    		   
    		   
	}

}
