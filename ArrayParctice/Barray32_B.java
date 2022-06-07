package ArrayParctice;

public class Barray32_B {
	static int res = 0;
	static void maxCircularSum(int a[], int n)
	  {
	    if (n == 1)
	      res= a[0];
	    else
	    {
		    int sum = 0;
		    for (int i = 0; i < n; i++) {
		      sum+= a[i];
		    }
		    
		    int curr_max = a[0], max_so_far = a[0],
		    curr_min = a[0], min_so_far = a[0];
		    
		    for (int i = 1; i < n; i++)
		    {
		      curr_max = Math.max(curr_max + a[i], a[i]);
		      max_so_far = Math.max(max_so_far, curr_max);
		      
		      curr_min = Math.min(curr_min + a[i], a[i]);
		      min_so_far = Math.min(min_so_far, curr_min);
		    }
		    if (min_so_far == sum) {
		      res= max_so_far;
		    }
		    res= Math.max(max_so_far, sum - min_so_far);
		  }
	  }
	  public static void main(String[] args)
	  {
	    int a[] = { 11, 10, -5, 8, -13, 10 };
	    int n = a.length;
	    maxCircularSum(a, n);
	    System.out.println("Maximum circular sum is " + res);
	  }
}
