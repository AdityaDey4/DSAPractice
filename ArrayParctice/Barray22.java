package ArrayParctice;

public class Barray22 {
	static void rotrate(int[] arr, int l)
	{
		int even=0,temp;
		for(int i=0;i<l;i++)
		{
			if(arr[i]>=0 && even<l)
			{
				temp=arr[i];
				arr[i]=arr[even];
				arr[even]=temp;
				even+=2;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6 , -5, -3, 2, -1, 7, 6, 9};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
