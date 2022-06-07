package ArrayParctice;

public class Earray4 {
	 static int minDist(int a[], int n, int x, int y) {
	        int p = -1,res=Integer.MAX_VALUE;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]==x || a[i]==y)
	            {
	                if(p!=-1 && a[i]!=a[p])
	                {
	                    res = Math.min(res,i-p);
	                }
	                p=i;
	            }
	        }
	        if(res==Integer.MAX_VALUE)
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
		int[] a = {1,2,3,2};
        int x=1,y=2;
        int n = a.length;
        int ans = minDist(a,n,x,y);
        System.out.print("Answer : "+ans);
	}

}
