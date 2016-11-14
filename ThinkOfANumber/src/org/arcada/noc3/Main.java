package org.arcada.noc3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int guessedNumber;
        int min = 1;
        int max = 10;
        int answer;
        boolean isGuessCorrect = false;

        while (!isGuessCorrect) {
            guessedNumber = (int) ((Math.random() * max) + min);

            System.out.println("Ange ifall talet " + guessedNumber + " är mindre (0), större (1) än det du tänkte på eller rätt (2): ");

            answer = Integer.parseInt(reader.readLine());

            if (answer == 2) {
                isGuessCorrect = true;
            } else if (answer == 1) {
                min = guessedNumber;
            } else {
                max = guessedNumber;
            }
        }

        System.out.println("GRATTIS!");
    }
}
