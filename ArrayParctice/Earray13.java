package ArrayParctice;

public class Earray13 {
	static long findSmallest(long[] arr, int n) 
    {
        long sum=0,t=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=t)
            {
                sum+=arr[i];
                t=sum+1;
            }
            else
            {
                return t;
            }
        }
        return t;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long[] arr = {1, 1, 3, 6, 9, 10, 20, 28};
		 int n = arr.length;
		 long ans = findSmallest(arr,n);
		 System.out.print("Answer : "+ans);
	}

}
