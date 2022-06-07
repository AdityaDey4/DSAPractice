package ArrayParctice;

public class Carray11 {
	static int[] a = {5, 15, 10, 20, 3};
	static double[] m= new double[a.length];
	static void findMedian(int n)
	{
		int l=0;
		if(n%2==1)
		{
			m[l]=(a[(n - 1) / 2] + a[(n / 2)+1]) / 2.0;
			System.out.print(m[l]+"   ");
		}
		else
		{
			m[l]=a[n/2];
			System.out.print(m[l]+"   ");
		}
		l++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			findMedian(i);
		}
		
	}
}
