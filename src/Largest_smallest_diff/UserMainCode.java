package Largest_smallest_diff;

public class UserMainCode {
	public static int getBigDiff(int arr[])
	{
		if(arr.length==1)
			return arr[0];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		return max-min;
	}
}
