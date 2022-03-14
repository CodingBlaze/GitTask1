package com.git;

import java.util.LinkedList;
import java.util.List;

class Department{
    // Declaring Department_Name, Department_Dean, Department_Students
    String Department_Name;
    String Department_Dean;
    List<Student> Department_Students=new LinkedList<Student>();

    //Initializing Instance variables using explicit constructor
    Department(String Department_Name,String Department_Dean)
    {
        this.Department_Name=Department_Name;
        this.Department_Dean=Department_Dean;
    }
    //Method to update Department_name
    void updateName(String New_name){
        Department_Name=New_name;
    }

    //Method to update Department_Dean
    void updateDean(String New_Dean) {
        Department_Dean=New_Dean;
    }
    //Method to add Students to Department_Students List
    void addStudent(Student student_Object) {
        Department_Students.add(student_Object);
    }

    //Prints the details of Students within this Department.
    void getStudentDetails(){
        for(Student student_Object:Department_Students) {
        	System.out.println(student_Object.getDetails());
        }
    }

}