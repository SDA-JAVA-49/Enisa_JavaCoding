package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.*;

class Employeerss {
    private int id;
    private String name;
    private double salary;

    public Employeerss(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Task7 {
    public static void main(String[] args) {
        List<Employeerss> employees = Arrays.asList(new Employeerss(1, "Alice", 28000), new Employeerss(2, "Bob", 35000), new Employeerss(3, "Charlie", 40000));

        Employeerss result = employees.stream().filter(Objects::nonNull).filter(e -> e.getSalary() >= 30000).findFirst().orElseThrow(() -> new NoSuchElementException("No employee found with salary >= 30000"));

        System.out.println("First valid employee: " + result);
    }
}


