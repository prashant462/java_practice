package Even_Odd_Sum;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String num=s.next();
		int res=UserMainCode.sumofOddEvenPosition(num);
		if(res==1)
			System.out.println("yes");
		else
			System.out.print("no");
	}
}
