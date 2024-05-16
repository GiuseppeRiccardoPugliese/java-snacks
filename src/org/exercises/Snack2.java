package org.exercises;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        /* Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome. */

        String[] name = {"Jay", "Daisy", "Tom", "Jordan", "Myrtle", "Nick", "Gatsby", "Meyer", "Lucille"};
        String[] surname = {"Gatsby", "Buchanan", "Wilson", "Carraway", "Fay", "Wolfsheim", "McKee", "Gatz", "LeSueur"};

        Random random = new Random();

        // Numero invitati
        int numInvitati = 10;

        System.out.println("Lista Falsa di Invitati:");

        // Generazione nomi casuali
        for (int i = 0; i < numInvitati; i++) {
            String nome = name[random.nextInt(name.length)];
            String cognome = surname[random.nextInt(surname.length)];
            System.out.println(nome + " " + cognome);
        }
    }
}
