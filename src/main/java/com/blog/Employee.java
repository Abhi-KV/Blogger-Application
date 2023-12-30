package com.blog;

public class Employee {
    private String name;
    private String city;
    private int salary;

    public Employee(String name, String city, int salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getSalary() {
        return salary;
    }
}
