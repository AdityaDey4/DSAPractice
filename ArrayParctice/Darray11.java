package ArrayParctice;

public class Darray11 {
	static int small(int[] a, int n, int f, int l, int ele)
	{
		int count = 0;
		for(int i = f;i<=l;i++)
		{
			if(a[i]<=ele)
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 3, 4, 5};
		int n = a.length;
		System.out.println("Small or equal number of 5 between a[0] to a[3] : "+small(a,n,0,3,5));
		System.out.println("Small or equal number of 2 between a[0] to a[2] : "+small(a,n,0,2,2));
	}

}
