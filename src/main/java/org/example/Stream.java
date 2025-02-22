package org.example;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 5, 7, 9, 11, 15, 35);
        System.out.println("List of numbers: " + nums);


        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average value of the said numbers: " + average);
    }
}
