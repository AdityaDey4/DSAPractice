package ArrayParctice;

public class Barray25 {
	static void rotrate(int[] arr, int l)
	{
		int odd =0 , temp;
		for(int i=0;i<l;i++)
		{
			if(arr[i]%2!=0)
			{
				temp=arr[i];
				arr[i]=arr[odd];
				arr[odd]=temp;
				odd++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 5, 4, 8, 10, 9, 2, 7};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
