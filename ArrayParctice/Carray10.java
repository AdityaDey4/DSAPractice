package ArrayParctice;

import java.util.Arrays;

public class Carray10 {
	static int findMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
 
        return sum / n;
    }
	static double findMedian(int a[], int n)
	{
		Arrays.sort(a);
		if(n%2==1)
		{
			return a[n/2];
		}
		else
		{
			return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5 ,3 ,8 ,6 ,1 ,7 ,2 ,4};
		int n = a.length;
		System.out.println("Mean = " + findMean(a, n));
        System.out.println("Median = " + findMedian(a, n));
	}

}
