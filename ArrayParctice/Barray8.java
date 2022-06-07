package ArrayParctice;

public class Barray8 {
	static void moveZerosToEnd(int[] arr, int l, int k)
	{
		int i, j, good=0;
		for(i=0;i<l;i++)
		{
			if(arr[i]<=k)
			{
				good=good+1;
			}
		}
		int ans=good;
		for(i=0;i<l-good+1;i++)
		{
			int bad=0;
			for(j=i;j<i+good;j++)
			{
				if(arr[j]>k)
				{
					bad=bad+1;
				}
			}
			ans=Math.min(bad, ans);
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2 ,11, 12, 6, 5, 3};
	    int n = arr.length;
	    int k=6;
	 
	    moveZerosToEnd(arr, n, k);
	}

}
