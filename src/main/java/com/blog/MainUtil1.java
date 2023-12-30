package com.blog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil1 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("mike","bengaluru",10000);
        Employee emp2 = new Employee("stallin", "chennai", 5000);
        Employee emp3 = new Employee("smith", "bengaluru", 10000);

        List<Employee> data = Arrays.asList(emp1,emp2,emp3);
//        List<Employee> newData = data.stream().filter(e -> e.getSalary() == 10000).collect(Collectors.toList());
//        List<Employee> newData = data.stream().filter(e -> e.getCity().equalsIgnoreCase("bengaluru")).collect(Collectors.toList());
        List<Employee> newData = data.stream().filter(e -> e.getName().startsWith("m")).collect(Collectors.toList());

        for (Employee employee:newData) {
            System.out.println(employee.getName());
            System.out.println(employee.getCity());
            System.out.println(employee.getSalary());
        }
    }
}
