package ArrayParctice;

public class Barray26 {
	static public void rotrate(int[] arr, int l)
	{
		int z=0;
		for(int i=0;i<l;i++)
		{
			if(arr[i]==0)
			{
				int temp=arr[i];
				arr[i]=arr[z];
				arr[z]=temp;
				z++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 1, 0, 0, 0, 1, 0, 0};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
