package ArrayParctice;

public class Barray30_A {
	static int product(int[] arr, int l)
	{
		int res = 0;
		for(int i=0;i<l;i++)
		{
			int mul=arr[i];
			for(int j=i+1;j<l;j++)
			{
				mul*=arr[j];
				res=Math.max(res, mul);
			}
			res=Math.max(res, mul);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6, -3, -10, 0, 2};
		System.out.print("Maximun Product : "+product(arr,arr.length));
	}
}
