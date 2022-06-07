package ArrayParctice;

public class Barray20 {
	static void rotrate(int[] arr, int l)
	{
		int index=l-1,temp;
		for(int i=l-1;i>=0;i--)
		{
			if(arr[i]<0)
			{
				temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6 , -5, -3, 2, -1};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
