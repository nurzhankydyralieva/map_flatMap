package com.company.classes;

import com.company.enums.Positions;

import java.math.BigDecimal;
import java.util.List;

public class Person {
    private String name;
    private Positions position;
    private int age;
    private BigDecimal salary;
    private List<Integer> phoneNumber;

    public Person(String name, Positions position, int age, BigDecimal salary, List<Integer> phoneNumber) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", age=" + age +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
