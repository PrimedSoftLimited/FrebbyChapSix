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
public class CountByAnything {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valChoice = input.nextInt();
        int count = 0;
        for (int num = valChoice; num <= 1000; ++num) {
            if (num % valChoice == 0) {
                System.out.print(num + ", ");
                ++count;
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }

        }
    }

}
