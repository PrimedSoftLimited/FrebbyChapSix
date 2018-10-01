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
public class Purchase {
    private double invoiceNum;
    private double salesAmt;
    private double salesTaxAmt;

    public void setInvoiceNum(double invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public void setSalesAmt(double salesAmt) {
        this.salesTaxAmt = (salesAmt / 100) * 5;

    }
    public void displayPurchDetails(double details){
        System.out.println(details);
    }
}
