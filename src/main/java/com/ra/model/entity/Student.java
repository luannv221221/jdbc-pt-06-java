package com.ra.model.entity;

public class Student {
    private int id;
    private String fullName;
    private int age;
    private boolean sex;
    private String phone;

    public Student() {
    }

    public Student(int id, String fullName, int age, boolean sex, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
