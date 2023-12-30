package com.blog;

public class Student implements Comparable<Student>{
    private long id;
    private String name;
    private int marks;

    public Student(long id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.getMarks()-o.getMarks();
    }
}
