package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Shkruaj numrat e ndarë me hapësirë: ");
            String input = scanner.nextLine();

            List<Integer> nums = Arrays.stream(input.split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());


            String result = getCommaSeparatedString(nums);
            System.out.println("Rezultati: " + result);

            scanner.close();
        }

        public static String getCommaSeparatedString(List<Integer> nums) {
            return nums.stream()
                    .map(num -> (num % 2 == 0 ? "e" : "o") + num)
                    .collect(Collectors.joining(","));
        }
    }

