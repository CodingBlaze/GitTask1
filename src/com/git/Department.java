package com.git;

class Department{
    // Declaring Department_Name, Department_Dean, Department_Students
    String Department_Name;
    String Department_Dean;
    long Department_Students;

    //Initializing Instance variables using explicit constructor
    Student(String Department_Name,String Department_Dean,long Department_Students)
    {
        this.Department_Name=Department_Name;
        this.Department_Dean=Department_Dean;
        this.Department_Students=Department_Students;
    }

    //Method to update Department_name
    void updateName(String New_name){
        Department_name=New_name;
    }

    //Method to update Department_Dean
    void updateDean(int New_Dean) {
        Department_Dean=New_Dean;
    }
    //Method to update Department_Students
    void updateStudents(int New_Students) {
        Department_Students=New_Students;
    }

    //Returns the Department_Name, Department_Dean, Department_Students as a String format.
    String getDetails(){
        return "Name: "+Department_Name+",Dean: "+Department_Dean+",Students: "+Department_Students;
    }

}