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
public class CreatePurchase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give an invoice number. Number should be between "
                + "10,000 and 8,000");
        double invoice = input.nextDouble();
        System.out.println("Sales amount pls.");
        double sales = input.nextDouble();
                Purchase purchase = new Purchase();

        while(invoice < 1000 || invoice > 8000 && sales <= 0){
            if(invoice >= 1000 || invoice <= 8000){
        purchase.setInvoiceNum(invoice);
        
        purchase.displayPurchDetails(invoice);
        }
            if(sales >= 0){
                 purchase.setSalesAmt(sales);
        purchase.displayPurchDetails(sales);
            }
System.out.println("Give an invoice number. Number should be between "
                + "10,000 and 8,000");
invoice = input.nextDouble();

        sales = input.nextDouble();
                System.out.println("Sales amount pls.");

    }
}
}
