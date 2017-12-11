/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Checkout {
    
    private int numItems = 0;
    private DessertItem[] desserts = new DessertItem[100];
    
    public Checkout()
    {
        
    }
    
    
    public void enterItem(DessertItem item)
    {
        desserts[numItems] = item;
        numItems++;
    }
    
    
    public void clear()
    {
        for(int i = 0; i < numItems; i++)
        {
            desserts[i] = null;
        }
        numItems = 0;
    }
    
    
    public String toString()
    {
        String output = "";
        output += DessertShoppe.STORE_NAME + "\n";
        output += "--------------------\n";
        output += "Number of Items: " + numItems + "\n\n";
        
        int preCost = 0;
        for(int i=0; i < numItems; i++)
        {
            output += desserts[i] + "\n";
            preCost += desserts[i].getCost();
        }
        output += "\n";
        
        String preTax = DessertShoppe.cents2dollarsAndCents(preCost);
        output += "Subtotal";
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - 8 - preTax.length(); i++)
        {
            output += " ";
        }
        output += preTax + "\n";
        
        output += "Tax";
        int tax = (int)Math.round(preCost * DessertShoppe.TAX_RATE/100.0);
        String taxS = DessertShoppe.cents2dollarsAndCents(tax);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - 3 - taxS.length(); i++)
        {
            output += " ";
        }
        output += taxS + "\n";
        
        output += "Total";
        int total = preCost + tax;
        String totalS = DessertShoppe.cents2dollarsAndCents(total);
        for(int i=0; i < DessertShoppe.RECEIPT_WIDTH - 5 - totalS.length(); i++)
        {
            output += " ";
        }
        output += totalS + "\n";
        return output;
    }
    
}
