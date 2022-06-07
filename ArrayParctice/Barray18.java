package ArrayParctice;
// array must be arranged with natural Number & sorted //
public class Barray18 {
	static void rotrate(int[] arr, int l)
	{
		int min=arr[0];
		int max=arr[l-1];
		for(int i=0;i<l;i++)
		{
			if(i%2==0)
			{
				arr[i]=max;
				max--;
			}
			else
			{
				arr[i]=min;
				min++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1 , 2, 3, 4, 5, 6, 7};
		rotrate(arr,arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
