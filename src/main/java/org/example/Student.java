package org.example;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;


public class Student implements Comparable<Student>{
    private String name;
    private Double grades;
    private String specialty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrades() {
        return grades;
    }

    public void setGrades(Double grades) {
        this.grades = grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Student(String name, Double grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", grades=" + grades +
                ", specialty=" + specialty + '\n';
    }


    public static void getAverageGrade1(ArrayList<Student> students) {

        var result1 = students.stream()
                .filter((e) -> e.getGrades() > 4.5)
                .filter((s) -> s.getSpecialty().equals("информатика"))
                .limit(5)
                .sorted(Comparator.comparing(Student::getGrades))
                .collect(Collectors.toList());

        System.out.println(result1);

    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

}
