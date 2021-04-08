package Electricity_Bill;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String prevString=s.next();
	String currString=s.next();
	int charge=s.nextInt();
	System.out.println(UserMainCode.calculateElectricityBill(currString, prevString, charge));
}
}
