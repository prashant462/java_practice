package Sequence_in_array;

public class UserMainCode {
	public static boolean searchSequence(int[] arr)
	{
		int[] a= {1,2,3};
		if(arr.length<3)
			return false;
		for(int i=0;i<(arr.length)-3;i++)
		{
			if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
				return true;
		}
		return false;
		
	}
}
