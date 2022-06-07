package ArrayParctice;

public class Earray10 {
	int countMinOperations(int[] arr, int n) {
	       int count=0;
	       while(true)
	       {
	           int z_count=0;
	           int j;
	           for(j=0;j<n;j++)
	           {
	               if(arr[j]%2==1)
	               {
	                   break;
	               }
	               else if(arr[j]==0)
	               {
	                   z_count+=1;
	               }
	           }
	           if(z_count==n)
	           {
	               return count;
	           }
	           if(j==n)
	           {
	               for(int i=0;i<n;i++)
	               {
	                   arr[i]=arr[i]/2;
	               }
	               count+=1;
	           }
	   
                for(int i=0;i<n;i++)
                {
                    if(arr[i]%2==1)
                    {
                        arr[i]=arr[i]-1;
                        count+=1;
                    }
                }
	           
	       }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {16, 16, 16};
        int n = arr.length;
        Earray10 s = new Earray10();
        int ans=s.countMinOperations(arr,n);
        System.out.print("Answer : "+ans);
	}

}
