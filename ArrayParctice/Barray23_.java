package ArrayParctice;

public class Barray23_ {
	static void rotrate(int[] arr, int l)
	{
		int prev = arr[0];
		arr[0]=arr[0]*arr[1];
		int last = arr[l-1]*arr[l-2];
		for(int i=1;i<l-1;i++)
		{
			int curr = arr[i];
			arr[i]=arr[i+1]*prev;
			prev=curr;
		}
		arr[l-1]=last;
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
