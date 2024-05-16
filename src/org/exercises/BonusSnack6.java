package org.exercises;

import java.util.Scanner;

public class BonusSnack6 {
    public static void main(String[] args) {
        //Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
        //Possibile usare solo :
        //cicli
        //chartAt
        //if / switch
        //Es. “25" come stringa deve essere convertito in intero 25.

//        String number = "4";
//
//        int x = number.charAt(0) - '0';
//        System.out.println(x);
//
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero sotto forma di stringa per convertirlo in numero");
        String number = scanner.nextLine();

       int result = 0;

        for (int i = 0; i < number.length(); i++) {
            int x = number.charAt(i) - '0'; //"sottraggo" il carattere - 0 al carattere presente nella mia stringa
            result = result * 10 + x;   //moltiplico la mia variabile result per 10 e aggiungo la mia x
        }

        scanner.close();

        System.out.println("Tipo numero: " + result);
    }
}
