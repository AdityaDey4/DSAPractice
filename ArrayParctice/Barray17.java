package ArrayParctice;

public class Barray17 {
	static void rotrate(int[] arr, int l)
	{
		int[] temp = new int[l];
		int index = 0;
		for(int i=0,j=l-1;i<l/2||j>=l/2;i++,j--)
		{
			if(index<l)
			{
				temp[index]=arr[j];
				index++;
			}
			if(index<l)
			{
				temp[index]=arr[i];
				index++;			
			}
		}
		for(int i=0;i<l;i++)
		{
			arr[i]=temp[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1 , 2, 3, 4, 5, 6, 7};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
