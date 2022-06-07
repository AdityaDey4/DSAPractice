package ArrayParctice;

public class Earray8 {
	public static int smallestSubWithSum(int a[], int n, int x)
	{
        int res = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>x)
            {
                return 1;
            }
        }
        for(int i=0;i<n;i++)
        {
            int sum=0,flag=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                flag+=1;
                if(sum>x)
                {
                    res=Math.min(res,flag);
                    break;
                }
            }
        }
        if(res == Integer.MAX_VALUE)
        {
            return -1;
        }
        else
        {
            return res;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 4, 45, 6, 0, 19};
        int n = a.length;
        int x = 51;
        int ans = smallestSubWithSum(a,n,x);
        System.out.print("Answer : "+ans);
	}

}
