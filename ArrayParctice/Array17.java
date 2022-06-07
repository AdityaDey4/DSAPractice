package ArrayParctice;

public class Array17 {
	static void check(int[] arr, int l)
	{
		int temp = arr[0],i;
		for(i=0;i<l-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		print(arr);
	}
	static void print(int[] arr)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int rotation = 2;
		for(int i=0;i<rotation;i++)
		{
			check(arr,arr.length);
		}
	}

}
