package org.exercises;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        //Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
        //Continuare a chiedere una nuova stringa finchè non si inserisce 0.

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Dammi una stringa (inserisci 0 per terminare):");

            //Stringa utente
            String userString = scanner.nextLine();

            if (userString.equals("0")) { //Se inserisci 0 esco dal ciclo
                System.out.println("Programma terminato.");
                break;
            }
            //contatori
            int caratteriAlfabetici = 0;
            int numeri = 0;
            int simboliNonAlfanumerici = 0;

            //Foreach
            for (char c : userString.toCharArray()) {
                if (Character.isLetter(c)) {
                    caratteriAlfabetici++;
                } else if (Character.isDigit(c)) {
                    numeri++;
                } else {
                    simboliNonAlfanumerici++;
                }
            }

            System.out.println("Caratteri alfabetici: " + caratteriAlfabetici);
            System.out.println("Numeri: " + numeri);
            System.out.println("Simboli non alfanumerici: " + simboliNonAlfanumerici);
        }

        scanner.close();
    }
}
