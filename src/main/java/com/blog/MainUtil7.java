package com.blog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUtil7 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("mike","bengaluru",10000);
        Employee emp2 = new Employee("mithun", "delhi", 5000);
        Employee emp3 = new Employee("adam", "bengaluru", 10000);

        List<Employee> list = Arrays.asList(emp1,emp2,emp3);
        Map<Integer, List<Employee>> groups = list.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(groups);
        for (Map.Entry<Integer,List<Employee>> entry:groups.entrySet()) {
            Integer salary = entry.getKey();
            List<Employee> employeeList = entry.getValue();
            System.out.println("Employee with salary:"+salary);
            for (Employee emp:employeeList) {
                System.out.println(emp.getName());
            }

        }

    }
}
