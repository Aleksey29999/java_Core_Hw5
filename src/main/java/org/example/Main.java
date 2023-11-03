package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();


        Student student1 = new Student("Коля", 4.3, "информатика");
        Student student2 = new Student("Степан", 4.6, "информатика");
        Student student3 = new Student("Семен", 4.7, "информатика");
        Student student4 = new Student("Иван", 4.8, "математика");
        Student student5 = new Student("Леша", 4.9, "информатика");
        Student student6 = new Student("Костя", 5.0, "биология");
        Student student7 = new Student("Петр", 4.9, "информатика");
        Student student8 = new Student("Слава", 4.7, "информатика");
        Student student9 = new Student("Влад", 4.3, "информатика");
        Student student10 = new Student("Сеня", 4.2, "матемматика");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        System.out.println(students);
        System.out.println(" ");
        Student.getAverageGrade1(students);



    }
}