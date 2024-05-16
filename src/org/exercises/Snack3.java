package org.exercises;

public class Snack3 {
    public static void main(String[] args) {
        // Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

        int[] arrInt = { 1, 2 , 3, 8, 10, 7, 6, 4, 9, 10};

        int sum = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if (i % 2 != 0) {
                sum += arrInt[i];
            }
        }
        System.out.println("La somma degli elementi in posizioni dispari è: " + sum);
    }
}
