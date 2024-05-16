package org.exercises;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
    // Data in input una stringa verificare se è palindroma

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi una parola");
        String userString = scanner.nextLine();

        scanner.close();

        String clean = userString.replaceAll("\\s+", "").toLowerCase();

        int length = clean.length();

        int forward = 0;

        int backward = length - 1;

        boolean palindrome = true;

        while (backward > forward) {

            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);

            if (forwardChar != backwardChar){
                System.out.println("La parola non e' palindroma");
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
        System.out.println("La parola e' palindroma");
        }
    }
}
