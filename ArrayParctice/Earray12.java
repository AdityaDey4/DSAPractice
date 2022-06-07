package ArrayParctice;

public class Earray12 {
	public static void minMerge(int[] arr, int n)
	{
		int i=0, j=n-1;
		int count = 0;
		while(i<j)
		{
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else if(arr[i]>arr[j])
			{
				arr[j-1]=arr[j-1]+arr[j];
				j--;
				count++;
			}
			else
			{
				arr[i+1]=arr[i]+arr[i+1];
				i++;
				count++;
			}
		}
		System.out.print("Answer : "+count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 5, 1};
		int n = arr.length;
		minMerge(arr,n);
	}

}
