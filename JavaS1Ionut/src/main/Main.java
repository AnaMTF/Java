package main;

import student.Note;
import student.Student;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("Seminar 1 Ionut");

        Student ana = new Student(1, "Ana");
        Student ion = new Student(2, "Ion");

        System.out.println("id ana: " + ana.getId());

        ana.setNotes(new Note(10, "OOP"));

        ion.setNotes(new Note(8, "OOP"));

        Student tana = (Student) ana.clone();
        tana.setNotes(new Note(9, "OOP"));
        System.out.println("id ana: " + ana.getId());
        System.out.println("id t: " + tana.getId());

        tana.setId(3);
        tana.setName("Tana");
        System.out.println("id t: " + tana.getId());

        System.out.println(
                "Ana: " + ana.getId() + " " + ana.getName() + " " + ana.getNotes().getGrade() + " " + ana.getNotes().getClassName()
        );

        //System.out.println(ana);
    }
}
