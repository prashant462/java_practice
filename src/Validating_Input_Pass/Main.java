package Validating_Input_Pass;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int res=UserMainCode.validatePassword(s.next());
		if(res==1)
			System.out.println("Valid");
		else {
			System.out.println("Invalid");
		}
	}

}
