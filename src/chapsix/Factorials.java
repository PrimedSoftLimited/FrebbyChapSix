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
public class Factorials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fact = 1;
        for (int num = 1; num <= number; ++num) {
            fact = fact * num;
        }
        System.out.println("Factorial of " + number + " is: " + fact);

    }
}
