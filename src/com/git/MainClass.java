package com.git;

public class MainClass {

	public static void main(String[] args) {

		// creating student objects
		Student Vikash = new Student("Vikash", 22, 101);

		Student Uday = new Student("Uday", 22, 102);

		Student Sailesh = new Student("Sailesh", 21, 103);

		Student Suresh = new Student("Suresh", 21, 104);

		Student Ajay = new Student("Ajay", 22, 105);

		// creating department objects
		Department Physics = new Department("Physics", "Suresh Babu");

		Department History = new Department("History", "Vinay Gopal");

		// adding students to departments
		Physics.addStudent(Vikash);

		Physics.addStudent(Uday);

		History.addStudent(Suresh);

		History.addStudent(Sailesh);

		History.addStudent(Ajay);

		History.addStudent(Ajay);

		Physics.getStudentDetails();
	}

}
