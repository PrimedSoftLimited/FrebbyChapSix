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
public class Perfect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int num = number; num < 1; --num) {
            if (number % num == 0) {
                System.out.println(number);
            }
        }
    }
}
