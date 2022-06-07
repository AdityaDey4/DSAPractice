package ArrayParctice;

public class Array13 {
	static int maxHum = 0;
	static void check(int[] arr, int l,int[] t)
	{
		int temp = arr[0],j;
		for(j=0;j<l-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[j]=temp;
		int currHum = 0;
		for(int k=0;k<l;k++)
		{
			if(arr[k]!=t[k]) {
				currHum++;
			}
		}
		maxHum = Math.max(maxHum, currHum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3, 0, 8, 4, 3};
		int[] t = new int[a.length];
		for(int j=0;j<a.length;j++)
		{
			t[j]=a[j];
		}
		for(int i=0;i<a.length-1;i++)
		{
			check(a,a.length,t);
		}
		System.out.println(maxHum);
	}
}
