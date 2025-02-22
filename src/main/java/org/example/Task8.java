package org.example;

import java.util.*;
import java.util.stream.*;

class Employer {
    private int id;
    private String name;
    private double salary;

    public Employer(int id, String name, double salary) {
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

public class Task8 {
    public static void main(String[] args) {
        List<Employer> employees = Arrays.asList(new Employer(1, "Alice", 28000), new Employer(2, "Bob", 35000), new Employer(3, "Charlie", 40000));

        Employer result = employees.stream().filter(Objects::nonNull).filter(e -> e.getSalary() >= 30000).findFirst().orElseThrow(() -> new NoSuchElementException("No employee found with salary >= 30000"));

        System.out.println("First valid employee: " + result);

        List<Employer> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employer::getName)).collect(Collectors.toList());

        System.out.println("Employees sorted by name: " + sortedEmployees);
    }
}




