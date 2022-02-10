package com.example.java.Task2_Student.Student;

public class Student {
    private String FirstName;
    private String LastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setAverageMark(double averageMark) {
        if (averageMark > 0 && averageMark <= 5){
            this.averageMark = averageMark;
        }
        else {
            this.averageMark = 0;
        }
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double getScholarship(double averageMark){
        if (averageMark == 5){
            return 100;
        }
        else {
            return 80;
        }
    }

}
