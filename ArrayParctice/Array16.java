package ArrayParctice;

public class Array16 {
	static int[] arr = new int[] {1, 2, 3, 4, 5};
	static void check(int start, int end)
	{
		int l = arr.length;
		int i,j;
		int temp2=arr[end];
		for(j=end-1;j>=0;j--)
		{
			arr[j+1]=arr[j];
		}
		arr[0]=temp2;
		for(int k=0;k<l;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] t = {{0,2},{0,3}};
		int rotation = 2, index = 1;
		for(int i=0;i<rotation;i++)
		{
			check(t[i][0],t[i][1]);
		}
		System.out.println(arr[index]);
	}

}
