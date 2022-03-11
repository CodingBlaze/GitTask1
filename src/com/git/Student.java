package com.git;

class Student {
	// Declaring Student_name , Student_age,Student_roll_number
	String studentName;
	int studentAge;
	long studentRollNumber;

	// Initializing Instance variables using explicit constructor
	Student(String studentName, int studentAge, long studentRollNumber) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentRollNumber = studentRollNumber;
	}

	// Method to update Student_name
	void updateName(String newName) {
		studentName = newName;
	}

	// Method to update Student_age
	void updateAge(int newAge) {
		studentAge = newAge;
	}

	// Returns the Student_name,Student_age and Student_roll_number as a
	// String format.
	String getDetails() {
		return "Name: " + studentName + ",Age: " + Integer.toString(studentAge) + ",Roll: "
				+ Long.toString(studentRollNumber);
	}

}