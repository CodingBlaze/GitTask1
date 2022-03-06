package com.git;

class Student{
	// Declaring Student_name , Student_age,Student_roll_number
	String Student_name;
	int Student_age;
	long Student_roll_number;
	
	//Initializing Instance variables using explicit constructor
	Student(String Student_name,int Student_age,long Student_roll_number)
	{
		this.Student_name=Student_name;
		this.Student_age=Student_age;
		this.Student_roll_number=Student_roll_number;
	}
	
	//Method to update Student_name
	void Update_name(String New_name){
		Student_name=New_name;
	}
	
	//Method to update Student_age
	void Update_age(int New_age) {
		Student_age=New_age;
	}
	
	//Returns the Student_name,Student_age and Student_roll_number as a String format. 
	String get_details(){
		return "Name: "+Student_name+",Age: "+Integer.toString(Student_age)+",Roll: "+Long.toString(Student_roll_number);
	}
	
}