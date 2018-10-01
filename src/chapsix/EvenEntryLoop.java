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
public class EvenEntryLoop {

    public static void main(String[] args) {
        int sentVal = 999;

        Scanner input = new Scanner(System.in);
        System.out.print("type an even number>>> ");
        int num = input.nextInt();
        while (num != sentVal) {
            if (num % 2 == 0) {
                System.out.println("Good Job");
            } else if (num % 2 != 0) {
                System.out.println("Error! " + num
                        + " not an even Number");
            } else {
                break;
            }
            num = input.nextInt();
        }

    }
}
