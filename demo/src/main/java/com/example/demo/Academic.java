package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Academic implements AcademicServices {
    ArrayList<Student> students;
    ArrayList<Curse> curses;

    HashMap<String, ArrayList<Student>> studentCurses;

    @Override
    public void matriculeStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addCurse(Curse curse) {
        curses.add(curse);
    }

    @Override
    public void bookStudent(Student student, int curse) {
        studentCurses.get(student.getId()).add(student);
    }

    @Override
    public void removeStudent(Student student, int curse) {
        studentCurses.get(student.getId()).remove(student);
    }
}
