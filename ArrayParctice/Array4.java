package ArrayParctice;

public class Array4 {
	void rotate(int[] array, int length)
    {
       int x = array[length-1], i;
       for (i = length-1; i > 0; i--)
       array[i] = array[i-1];
       array[0] = x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array4 o = new Array4();
		int arr[]= {1,2,3,4,5,6,7};
		int l = arr.length;
		o.rotate(arr , l);
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
