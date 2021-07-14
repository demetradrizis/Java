/*
 Demetra Drizis
 Assignment 1
 Exercise 3.12
 */

import java.util.Scanner;

public class TestforInvoice 
{
	public static void main (String [] args)
	{
	
	Invoice invoice = new Invoice (" ", " ", 0, 0.0);       //default
	
	
	Scanner input = new Scanner (System.in);
	
	String item;
	String description;
	int quantity;                                   //declared variables
	double price;
	
	System.out.print("Enter Number: ");
	item = input.nextLine();
	invoice.setpartnum(item);                      //printing out number
	
	System.out.print("Enter Description: ");
	description = input.nextLine();                 //printing out description
	invoice.setpartdesc(description);
	
	System.out.print("Enter quantity: ");
	quantity = input.nextInt();
	
	if (quantity > 0)
		invoice.setquant(quantity);                //making sure quantity is right size
	
	System.out.print("Enter Price: ");
	price = input.nextDouble();
	
	if (price > 0)
		invoice.setprice(price);
		
	System.out.printf("The total is: $%.2f\n", invoice.getInvoice());   //print total
	
	}
}
