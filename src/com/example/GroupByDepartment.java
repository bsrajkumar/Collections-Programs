package com.example;

import com.example.dto.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args){
        List<Employee> employees = List.of(
                new Employee(1, "Raj", "IT"),
                new Employee(2, "Kumar", "HR"),
                new Employee(3, "Siva", "IT"),
                new Employee(4, "Arun", "Finance"),
                new Employee(5, "Ravi", "HR")
        );

        Map<String, List<Employee>> empbyDept = employees.stream()
                                                     .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(empbyDept);

        Map<String, List<String>> empNamesByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(Employee::getName, Collectors.toList())
                        ));
        System.out.println(empNamesByDept);

        Map<String, Long> deptCount =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        ));

        System.out.println(deptCount);

    }
}
