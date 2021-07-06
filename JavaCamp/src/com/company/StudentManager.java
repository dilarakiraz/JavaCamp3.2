package com.company;

public class StudentManager extends UserManager {

    public void editToProfile(Student student) {
        System.out.println(student.getId()+"numaralı ögrenci " + student.getFirstName()+student.getLastName()+"  profilini düzenledi.");
    }
}
