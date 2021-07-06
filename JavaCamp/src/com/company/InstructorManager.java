package com.company;

public class InstructorManager extends UserManager {
    public void addToHomework(Instructor ınstructor){
        System.out.println(" "+ınstructor.getFirstName()+" "+ınstructor.getLastName()+ "  tarafindan"+ınstructor.getHomeWork()+" ödevi eklendi");

    }
}
