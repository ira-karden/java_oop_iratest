package com.example.java.Task2_Student.Student_run;

import com.example.java.Task2_Student.Aspirant.Aspirant;
import com.example.java.Task2_Student.Student.Student;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
        new Student("Irina", "Karden", "LE-11", 5.0),
        new Student("Ann", "Ivanova", "EF-21", 4.3),
        new Student("Max", "Plank", "FX-01", 2.1),
        new Aspirant("Nikola", "Tesla", "AA-33", 4.9, "Nikolas work 1"),
        new Aspirant("Tomas", "Edison", "ES-03", 1.0, "Tomas work 1"),
        new Aspirant("Mariya", "Kuri", "DE-22", 5.0, "Mariya work 1")
        };

        for (Student s: students){
            System.out.println(s.getFirstName()+" "+s.getLastName()+", "+s.getGroup()+", "+s.getAverageMark());
            System.out.println(s.getFirstName()+" "+s.getLastName()+" has a scholarship: "+s.getScholarship(s.getAverageMark()));
        }
        System.out.println("---------------------------------Excellent aspirants--------------------------------------------------");

        Student aspirant1 = new Aspirant("Nikola", "Tesla", "AA-33", 5.0, "Nikolas work 1");
        System.out.println(aspirant1.getFirstName()+" "+aspirant1.getLastName()+", "+aspirant1.getGroup()+", "+aspirant1.getAverageMark());
        System.out.println("Has a scholarship: "+aspirant1.getScholarship(aspirant1.getAverageMark()));
        Aspirant aspirant2 = new Aspirant("Tomas", "Edison", "ES-03", 5.0, "Tomas work 1");
        System.out.println(aspirant2.getFirstName()+" "+aspirant2.getLastName()+", "+aspirant2.getGroup()+", "+aspirant2.getAverageMark()+", "+aspirant2.getScientificWork());
        System.out.println("Has a scholarship: "+aspirant2.getScholarship(aspirant2.getAverageMark()));


    }
}
