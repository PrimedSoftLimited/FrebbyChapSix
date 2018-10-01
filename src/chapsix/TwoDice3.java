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
public class TwoDice3 {
    static int savePickedNum;
    public static void main(String[] args){
        final int CARDS_IN_SUIT = 12;
        int save = 0;
        int random1 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        int random2 = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        Scanner input = new Scanner(System.in);
        int pickedNum = input.nextInt();
        
                boolean checkPickedNum = pickedNum < 2 || pickedNum > 12;
        System.out.println("Choose a random number from 2 to 12");
        while(checkPickedNum){
            
        if(!checkPickedNum){
            savePickedNum = pickedNum;
            System.out.println(pickedNum);
        }

             System.out.println("Nope. Try again");
                        pickedNum = input.nextInt();           
        }
             
              
              for(int x = 0; x < 3; ++x){
                  System.out.println("Throw. choose two numbers, as a throw.");
                  int firstThrow = input.nextInt();
                int secondThrow = input.nextInt();
                 boolean saveThrow1 = firstThrow == random1;
              boolean saveThrow2 = secondThrow == random2;
              
              if(saveThrow1 ){
                  save += firstThrow;
                  System.out.println("Good job!!! Throw Dice matched initialized"
                          + "numkber " + pickedNum);
              }
              else if(saveThrow2){
               save += secondThrow;
              }
              
              }
                

        
    }
}
