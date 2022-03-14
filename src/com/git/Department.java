package com.git;

import java.util.LinkedList;
import java.util.List;

class Department {
	// Declaring Department_Name, Department_Dean, Department_Students
	String departmentName;
	String departmentDean;
	List<Student> departmentStudents = new LinkedList<Student>();

	// Initializing Instance variables using explicit constructor
	Department(String departmentName, String departmentDean) {
		this.departmentName = departmentName;
		this.departmentDean = departmentDean;
	}

	// Method to update Department_name
	void updateName(String newName) {
		departmentName = newName;
	}

	// Method to update Department_Dean
	void updateDean(String newDean) {
		departmentDean = newDean;
	}

	// Method to add Students to Department_Students List
	void addStudent(Student studentObject) {
		departmentStudents.add(studentObject);
	}

	// Prints the details of Students within this Department.
	void getStudentDetails() {
		for (Student student_Object : departmentStudents) {
			System.out.println(student_Object.getDetails());
		}
	}

}