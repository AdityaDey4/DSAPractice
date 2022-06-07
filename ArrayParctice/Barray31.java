package ArrayParctice;

public class Barray31 {
	static public void rotrate(int[] arr, int l)
	{
		int max = arr[l-1];
		int temp;
		arr[l-1]=-1;
		for(int i=l-2;i>=0;i--)
		{
			temp=arr[i];
			arr[i]= max;
			if(max<temp)
			{
				max=temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {16, 17, 3, 4, 5, 2};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
