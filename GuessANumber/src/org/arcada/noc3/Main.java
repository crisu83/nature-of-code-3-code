package org.arcada.noc3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int secretNumber = (int) ((Math.random() * 10) + 1);
        int guessedNumber;
        boolean isGuessCorrect = false;

        while (!isGuessCorrect) {
            System.out.println("Ange ett tal mellan 1 och 10: ");
            guessedNumber = Integer.parseInt(reader.readLine());

            if (guessedNumber == secretNumber) {
                isGuessCorrect = true;
            } else if (guessedNumber < secretNumber) {
                System.out.println("Din gissning var för liten.");
            } else {
                System.out.println("Din gissning var för stor.");
            }
        }

        System.out.println("GRATTIS! Du gissade rätt!");
    }
}
