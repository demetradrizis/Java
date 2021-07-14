/*
 Demetra Drizis
 Assignment 1
 Exercise 3.12
 */
public class Invoice
{
	private String partnum;
	private String partdesc;
	private int quant;                      //declaring variables
	private double price;
	
	public Invoice (String num, String desc, int quantity, double priceitem)
	{
		partnum = num;
		partdesc = desc;
		quant= quantity;                    //making variables equal to each other
		price = priceitem;
	}
	
	public void setpartnum(String num)
	{
		partnum = num;
	}
	
	public String getpartnum()
	{
		return partnum;
	}
	
	public void setpartdesc(String desc)
	{
		partdesc = desc;
	}
	
	public String getpartdesc()
	{
		return partdesc;
	}
	
	public void setquant(int quantity)
	{
		quant = quantity;
	}
	
	public int getquant()
	{
		return quant;                                       //getting and setting variables
	}
	
	public void setprice(double priceitem)
	{
		price = priceitem;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public double getInvoice()
	{
		double total;
		total = quant * price;                               //get total
		return total;
	}

}
