/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapsix;

/**
 *
 * @author Frebby
 */
public class CountByThrees {
    public static void main(String[] args){
        
        for(int count = 1; count <= 300; ++count){
            System.out.print(count + ", ");
            if(count % 30 == 0){
                System.out.println();
            }
        }
    }
}
