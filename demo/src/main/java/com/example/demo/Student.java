package com.example.demo;

public class Student extends Person {
    private String id;
    //enum status
    private enum Status{
        ACTIVE,
        INACTIVE,
        GRADUATED
    }
    private Status status;


    public Student(){
       super( "","",0,"");
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }
}
