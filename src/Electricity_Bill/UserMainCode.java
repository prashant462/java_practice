package Electricity_Bill;

public class UserMainCode {
	public static int calculateElectricityBill(String curr,String prev,int charge)
	{
		int current=Integer.parseInt(curr.substring(5));
		int previous=Integer.parseInt(prev.substring(5));
		return (current-previous)*charge;
	}
}
