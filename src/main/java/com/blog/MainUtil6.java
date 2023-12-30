package com.blog;

import java.util.Arrays;
import java.util.List;

public class MainUtil6 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"mike",93);
        Student s2 = new Student(2,"adam",87);
        Student s3 = new Student(3,"stallin",98);
        Student s4 = new Student(4,"smith",85);

        List<Student> data = Arrays.asList(s1,s2,s3,s4);
        Student maxMarks = data.stream().max(Student::compareTo).get();
        System.out.println(maxMarks.getId());
        System.out.println(maxMarks.getName());
        System.out.println(maxMarks.getMarks());
    }

}
