package ArrayParctice;

public class Array2 {
	void reverse(int array[] , int start , int end)
	{
        while (start < end) {
        	int temp;
        	temp = array[start];
        	array[start]=array[end];
        	array[end]=temp;
        	start++;
            end--;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 o = new Array2();
		int arr[]= {1,2,3,4,5,6,7};
		int l = arr.length;
		o.reverse(arr , 0, 2);
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
