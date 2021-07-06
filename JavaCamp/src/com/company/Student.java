package com.company;

public class Student extends User{
    private String studentNumber;
    private String studentLocation;
    public Student(){

    }
    public Student(String studentNumber,String studentLocation){
        super();
        this.studentNumber=studentNumber;
        this.studentLocation=studentLocation;
    }
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }
}
