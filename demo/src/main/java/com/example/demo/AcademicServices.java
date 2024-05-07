package com.example.demo;

public interface AcademicServices {
    void matriculeStudent(Student student);

    void addCurse(Curse curse);

    void bookStudent(Student student, int curse);

    void removeStudent(Student student, int curse);


}
