package Even_Odd_Sum;

public class UserMainCode {
	public static int sumofOddEvenPosition(String num)
	{
		int c1=0;
		int c2=0;
		for(int i=0;i<num.length();i++)
		{
			if(i%2==0)
				c1=c1+Integer.parseInt(String.valueOf(num.charAt(i)));
			else
				c2=c2+Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		if(c1==c2)
			return 1;
		else
			return -1;
				
	}
}
