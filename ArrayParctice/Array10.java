package ArrayParctice;

public class Array10 {
	public void countRotation(int arr[], int l, int n)
	{
		int temp[]= new int[n];
		n = n%l;
		int n2 = n,i;
		for(int k=0;k<n;k++)
		{
			temp[k]=arr[k];
		}
		for(i=0;i<l-n;i++)
		{
			arr[i]=arr[n2];
			n2++;
		}
		for(int j=0;j<n;j++)
		{
			arr[i]=temp[j];
			i++;
		}
		print(arr,l);
	}
	static void print(int[] arr, int l) {
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= new int[] {5,6,7,8,1,2};
		Array10 a = new Array10();
		a.countRotation(array,array.length,2);
		a.countRotation(array,array.length,4);
		a.countRotation(array,array.length,7);
	}

}
