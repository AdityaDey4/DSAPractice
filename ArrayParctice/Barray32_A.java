package ArrayParctice;
// Maximum Sub Array Sum //
// Kadene's Algorithm //
import java.util.Arrays;
public class Barray32_A {
	static int res=0;
	static void sort(int[] arr, int l)
	{
		Arrays.sort(arr);
		res = arr[l-1];
	}
	static void maximumSum(int[] arr, int l)
	{
		int i=0,sum=0;
		int flag = 0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<=0)
			{
				flag+=1;
			}
		}
		if(flag==arr.length)
		{
			sort(arr,l);
		}
		else
		{
			for(i=0;i<arr.length;i++)
			{
				sum=Math.max(sum+arr[i], arr[i]);
				res=Math.max(res, sum);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11, 10, -5, 8, -13, 10};
		maximumSum(arr,arr.length);
		System.out.print(res);
	}

}
