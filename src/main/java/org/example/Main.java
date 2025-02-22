package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("the number: ");
        int num = scanner.nextInt();


        String numStr = Integer.toString(num);
        String reversedStr = "";

        int i = numStr.length() - 1;
        while (i >= 0) {
            reversedStr += numStr.charAt(i);
            i--;
        }

        int reversedNum = Integer.parseInt(reversedStr);

        System.out.println("reverset number: " + reversedNum);

        scanner.close();
    }
}
