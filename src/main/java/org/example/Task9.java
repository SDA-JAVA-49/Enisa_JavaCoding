package org.example;

import java.util.*;
import java.util.stream.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Task9 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", 28000), new Employee(2, "Bob", 35000), new Employee(3, "Charlie", 40000));

        Employee result = employees.stream().filter(Objects::nonNull).filter(e -> e.getSalary() >= 30000).findFirst().orElseThrow(() -> new NoSuchElementException("No employee found with salary >= 30000"));

        System.out.println("First valid employee: " + result);

        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

        System.out.println("Employees sorted by name: " + sortedEmployees);

        double maxSalary = employees.stream().mapToDouble(Employee::getSalary).max().orElseThrow(() -> new NoSuchElementException("No employees available"));

        System.out.println("Maximum salary: " + maxSalary);
    }
}


