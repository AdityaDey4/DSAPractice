package ArrayParctice;

public class Darray6 {
	static void findFrequency(int[] a, int n, int ele, int f, int l)
	{
		int flag = 0;
		for(int i = f-1;i<l-1;i++)
		{
			if(a[i]==ele)
			{
				flag = flag+1;
			}
		}
		System.out.print(flag);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 8, 6, 9, 8, 6, 8, 2, 11};
	    int n = a.length;
	    int ele = 8;
	    findFrequency(a,n,ele,2,8);
	}

}
