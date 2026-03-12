package com.lpu.Day1;

import java.util.List;
import java.util.Map;

public class College {

	private List<String> students;
	private Map<Integer, String> studentMap;

	public List<String> getStudents() {
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}

	public Map<Integer, String> getStudentMap() {
		return studentMap;
	}

	public void setStudentMap(Map<Integer, String> studentMap) {
		this.studentMap = studentMap;
	}

	public void showData() {
		System.out.println(students);
		System.out.println(studentMap);
	}
}