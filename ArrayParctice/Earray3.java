package ArrayParctice;

public class Earray3 {
	static void least_average(int[] arr, int k)
	{
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i<k;i++)
		{
			sum = sum + arr[i];
		}
		int res = sum;
		int last = 0,first=0;
		for(int j=k;j<n;j++)
		{
			sum+=arr[j]-arr[j-k];
			if(res>sum)
			{
				res = sum;
				last = j;
				first = j-k+1;
			}
			else
			{
				last = k-1;
				first = 0;
			}
		}
		System.out.println("First Index : "+first+" Last Index : "+last);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={10 , 20, 30};
		int k = 2;
		least_average(arr,k);
	}

}
