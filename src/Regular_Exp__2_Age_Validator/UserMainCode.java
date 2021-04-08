package Regular_Exp__2_Age_Validator;

public class UserMainCode {
	public static boolean ValidAge(String num)
	{
		if(num.matches("[21-45]{2}"))
			return true;
		return false;
	}
}
