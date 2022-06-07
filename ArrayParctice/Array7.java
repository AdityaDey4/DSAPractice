package ArrayParctice;
 // two time rotation //
import java.util.Arrays;

class Array7
{
    static int arr[] = new int[]{1,20,2,10};
     
    // Returns max possible value of i*arr[i]
    static void rotation()
    {
    	int value = arr[0];
    	for(int i=0;i<arr.length-1;i++)
    	{
    		arr[i]=arr[i+1];
    	}
    	arr[arr.length-1]=value;
    	
    }
    static int maxSum()
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        	sum=sum+(i*arr[i]);
        }
        return sum;
    }
     
    // Driver method to test the above function
    public static void main(String[] args)
    {
    	rotation();
    	rotation();
        System.out.println("Max sum by doing two times rotation " + maxSum());
    }
}