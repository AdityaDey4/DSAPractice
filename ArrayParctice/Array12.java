package ArrayParctice;

public class Array12 {
	public void Rotation(int arr[], int l, int n)
	{
		n = n%l;
		int temp[]= new int[l-n];
		int n2 = l-n,i;
		for(int k=0;k<l-n;k++)
		{
			temp[k]=arr[k];
		}
		
		for(i=0;i<n;i++)
		{
			arr[i]=arr[n2];
			n2++;
		}
		for(int j=0;j<l-n;j++)
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
		Array12 a = new Array12();
		a.Rotation(array,array.length,2);
		a.Rotation(array,array.length,4);
		a.Rotation(array,array.length,7);
	}

}

