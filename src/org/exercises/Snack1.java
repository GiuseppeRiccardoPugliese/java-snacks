package org.exercises;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
//        Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int userNumber = scanner.nextInt();

        scanner.close();

        if (userNumber % 2 == 0) {
            System.out.println("Il numero e' pari: " + userNumber);
        } else if (userNumber % 1 == 0) {
            userNumber += +1;
            System.out.println("Il numero e' dispari quindi stampo il successivo: " + userNumber);
        }
    }
}
