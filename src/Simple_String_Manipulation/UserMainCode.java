package Simple_String_Manipulation;

public class UserMainCode {
	public static int calculateWordSum(String input)
	{
		String[] ar=input.split(" ");
		if(ar[0].equals(ar[ar.length-1]))
		{
			return ar[0].length();
		}
		else
		{
			return ar[0].length()+ar[ar.length-1].length();
		}
	}
}
