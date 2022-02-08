package com.example.java.Task2_Student.Aspirant;

import com.example.java.Task2_Student.Student.Student;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName,group, averageMark);
        this.scientificWork = scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    @Override
    public double getScholarship(double averageMark){
        if (averageMark == 5){
            return 200;
        }
        else {
            return 180;
        }
    }
}
