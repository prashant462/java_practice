package Largest_smallest_diff;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scanner.nextInt();
		System.out.println(UserMainCode.getBigDiff(arr));
	}

}
