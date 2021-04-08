package Regular_Expression_1;
import java.util.*;
public class UserMainCode {

	public static boolean Validate(String input)
	{
		if(input.matches("[a-zA-Z]{1}[R]{1}[0-9]{1}."))
			return true;
		else
			return false;
	}
}
