package com.example.demo;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private String id;

    public Person(){
        this.name = "";
        this.lastName = "";
        this.age = 0;
        this.id = "";
    }
    public Person(String name, String lastName, int age, String id) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }
}
