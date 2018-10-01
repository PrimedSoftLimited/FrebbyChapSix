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
public class TestScoreStatistics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalScore = 0;
        double highestScore;
        int sentVal = 999;
                    System.out.println("Score pls >>>");

        int score = input.nextInt();
        
        while(score != sentVal){
                totalScore = totalScore + score;

                if(score == sentVal)
                System.out.println("Total score is " + totalScore);
                
                
            if(score < 0 || score > 100)
                System.out.println("Do not use this score");
            

            System.out.println("Next score pls >>>");
            score = input.nextInt();
        }
    }
}
