/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapsix;

import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class RandomGuess3 {

    public static void main(String[] args) {
        final int CARDS_IN_SUIT = 10;
        int guesses = 0;
        int random = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        while (guess != random) {
            if (guess > random) {
                System.out.println("Higher than random ");
                guesses += 1;

            } else if (guess < random) {
                System.out.println("Lesser than random ");
                guesses += 1;
            }
                 else {
                System.out.println("Nah");
            }
            guess = input.nextInt();
        }
       if(guess == random) {
                System.out.println("Awesome!!! Random is " + random);
                        System.out.println("Guesses = " + guesses);

            }

    }

}
