package ArrayParctice;
// kadane algorithm 
public class Earray1 {
	static int maxSubarraySum(int arr[], int n)
	{
		int sum=0;
		int res = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			res = Math.max(res, sum);
			if(sum<0)
			{
				sum=0;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,-2,5};
		int n = arr.length;
		System.out.print("Highest Subarray Sum : "+maxSubarraySum(arr,n));
	}

}
