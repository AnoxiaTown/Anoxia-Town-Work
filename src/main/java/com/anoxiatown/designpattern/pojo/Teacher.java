package com.anoxiatown.designpattern.pojo;

public class Teacher {

    private String number;
    private String name;
    private int age;

    public Teacher(String number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}