package Regular_Expression_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		boolean res=UserMainCode.Validate(input);
		if(res)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

	}

}
