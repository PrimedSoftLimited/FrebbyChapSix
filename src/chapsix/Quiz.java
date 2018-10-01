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
public class Quiz {
    static int count = 0;
    public static void main(String[] args){
        int questionOneAnswer = 2;
                String questionTwoAnswer = "false";
                
                quizOne();
        quizTwo();
        
                if(questionOneAnswer == quizOne() && questionTwoAnswer == quizTwo()){
                    System.out.println("You got " + count + "out of 2");
                }
                else{
                    System.out.println(count);
                }

        
        
    }
    
    public static int quizOne(){
        Scanner input = new Scanner(System.in);
        String quiz = "What is the standard number of tennis players per board";
        System.out.println(quiz);
        int answer = input.nextInt();
        if(answer == 2){
            System.out.println("Correct!!");
            count += 1;
        }
        else
                        System.out.println("Wrong!!");
return 2;
    }
    public static String quizTwo(){
        Scanner input = new Scanner(System.in);
        String quiz = "The earth is closest to the sun, True or False";
        System.out.println(quiz);
        String answer = input.next();
        if(answer.equals("false") || answer.equals("False")){
            System.out.println("Correct!!");
            count += 1;
        }
        else
                        System.out.println("Wrong!!");
return "false";
    }
    

    }
}
