package Validating_Input_Pass;

public class UserMainCode {
	public static int validatePassword(String input) {
		if(input.length()<8)
			return -1;
		if(!input.contains("@") && !input.contains("_") && !input.contains("#"))
			return -1;
		if(input.charAt(0)=='@' || input.charAt(0)=='_' || input.charAt(0)=='#')
			return -1;
		int l=input.length();
		if(input.charAt(l-1)=='@' || input.charAt(l-1)=='_' || input.charAt(l-1)=='#')
			return -1;
		if(Character.isDigit(input.charAt(0)))
			return -1;
		return 1;
	}
}
