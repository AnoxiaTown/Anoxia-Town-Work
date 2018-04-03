package com.anoxiatown.designpattern.builder;

/**
 * Builder Pattern 第一种写法
 */
public class Student {

    private String number;
    private String name;
    private int age;

    private Student(String number, String name, int age) {
        if (number == null) {
            throw new IllegalArgumentException("Parameter number cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name cannot be null.");
        }
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public static class Builder {
        private String number;
        private String name;
        private int age;

        public Builder(String number) {
            this.number = number;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        Student build() {
            return new Student(this.number, this.name, this.age);
        }
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