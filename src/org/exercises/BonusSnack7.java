package org.exercises;

import java.util.Scanner;

public class BonusSnack7 {
    public static void main(String[] args) {
        //Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci i secondi da convertire");
        int secondsToConvert = Integer.parseInt(scanner.nextLine());

        scanner.close();

        int hours = 0, minutes = 0, seconds = 0;

        //Calcolo ore
        hours = secondsToConvert / 3600;
//        secondsToConvert %= 3600;

        //Calcolo minuti
        minutes = secondsToConvert - (hours * 3600);
        minutes /= 60;
//        minutes = secondsToConvert / 60;

        //Calcolo secondi
        seconds = secondsToConvert - (hours * 3600) - (minutes * 60);
//        seconds = secondsToConvert % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("Tempo convertito: " + formattedTime);
    }
}
