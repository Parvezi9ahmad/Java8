package com.learn.java.StreamsTerminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamGroupingByExample {

	public static Map<String, List<Student>> groupStudentBygender() {
		Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		return collect;
	}

	public static Map<String, List<Student>> customizedGroupBy() {
		Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "outstanding" : "average"));
		return collect;
	}

	public static Map<String, Map<String, List<Student>>> twoLevelGrouping() {
		Map<String, Map<String, List<Student>>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender,
						Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "outstanding" : "average")));
		return collect;
	}

	public static Map<Integer, Map<Object, List<Student>>> twoLevelGrouping1() {
		Map<Integer, Map<Object, List<Student>>> collect = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.9 ? "outstanding" : "average")));
		return collect;
	}
	public static Map<Integer, Integer> twoLevelGrouping_2() {
		Map<Integer,Integer> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNoteBooks)));
		return collect;
	}
	
	public static LinkedHashMap<String, Set<Student>> twoLevelGrouping_3() {
		LinkedHashMap<String,Set<Student>> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
		return collect;
	}
	public static Map<Integer, Optional<Student>> calculateToGpa() {
		Map<Integer,Optional<Student>> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		return collect;
	}
	
	public static Map<Integer, List<String>> Gradegpa(){
		Map<Integer, List<String>> collect = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.mapping(Student::getName, Collectors.toList())));
		return collect;
	}
	public static void main(String[] args) {

		/*
		 * Map<String, List<Student>> groupStudentBygender = groupStudentBygender();
		 * groupStudentBygender.forEach((name, datas) -> { System.out.println(name +
		 * "  " + datas); });
		 */

		// System.out.println(groupStudentBygender());

		/*
		 * Map<String, List<Student>> customizedGroupBy = customizedGroupBy();
		 * customizedGroupBy.forEach((str, obj) -> { System.out.println(str + "   " +
		 * obj); });
		 */ // System.out.println(customizedGroupBy());

		/*
		 * Map<String, Map<String, List<Student>>> twoLevelGrouping =
		 * twoLevelGrouping(); twoLevelGrouping.forEach((s,v)->{
		 * System.out.println(s+"   "+v); });
		 */

		/*
		 * Map<Integer, Map<Object, List<Student>>> twoLevelGrouping1 =
		 * twoLevelGrouping1(); twoLevelGrouping1.forEach((k, v) -> {
		 * System.out.println(k + "   " + v); });
		 */
		//System.out.println(twoLevelGrouping_2());
		//System.out.println(twoLevelGrouping_3());
		System.out.println(calculateToGpa());
		System.out.println(Gradegpa());
	}

}
