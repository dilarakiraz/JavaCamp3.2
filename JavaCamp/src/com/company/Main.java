package com.company;

public class Main {

    public static void main(String[] args) {
	Student student=new Student("9999","kırklareli");
	student.setStudentNumber("1");
	student.setFirstName("Dilara");
	student.setLastName("Kiraz");
	student.setEmail("dilarakiraz@gmail.com");
	student.setId(1);

	Instructor ınstructor1=new Instructor();
		ınstructor1.setFirstName("engin");
		ınstructor1.setLastName("demirog");
		ınstructor1.setId(1);
		ınstructor1.setEmail("engindemirog@gmail.com");
		ınstructor1.setHomeWork("java kampı 3.gün 2.ödevi");




    }
}
