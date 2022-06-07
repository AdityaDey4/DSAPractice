package ArrayParctice;

public class Darray15 {
	static int countNumber(int[] a, int n, int f, int l, int k)
	{
		int count = 0;
		for(int i = f ; i <= l ; i++)
		{
			int div =0;
			for(int j=f;j<=l;j++)
			{
				if(a[j]%a[i]==0)
				{
					div+=1;
				}
				else
				{
					break;
				}
			}
			if(div==(l-f+1))
			{
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {3, 9, 12, 2, 4, 6, 2};
		int n = a.length;
		int i=0,j=2;
		int k = 2;
        System.out.println("Total Numbers between "+i+" and "+j+" divided by 2 is : "+countNumber(a,n,i,j,k));
        i=2;
        j=6;
        System.out.println("Total Numbers between "+i+" and "+j+" divided by 2 is : "+countNumber(a,n,i,j,k));
	}

}
