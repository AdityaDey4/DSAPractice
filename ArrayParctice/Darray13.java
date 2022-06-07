package ArrayParctice;

public class Darray13 {
	static int countNumber(int[] a, int n, int f, int l)
	{
		int count = 0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>=f && a[i]<=l)
			{
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 9, 10, 3 };
        int n = a.length;
        int i=1,j=4;
        System.out.println("Total Numbers between "+i+" and "+j+" is : "+countNumber(a,n,i,j));
        i=9;
        j=10;
        System.out.println("Total Numbers between "+i+" and "+j+" is : "+countNumber(a,n,i,j));
	}
}
