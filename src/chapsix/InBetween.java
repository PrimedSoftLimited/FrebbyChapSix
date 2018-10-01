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
public class InBetween {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("give two integer numbers");
        System.out.print("First>>> ");
        int firstInt = input.nextInt();
                System.out.print("Second>> ");

        int secInt = input.nextInt();
        for(int num = ++firstInt; num < secInt; ++num){
            System.out.println(num);
        }
        for(int num = --firstInt; num > secInt; --num){
            System.out.println(num);
        }
        
    }
}
