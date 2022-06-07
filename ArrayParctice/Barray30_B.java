package ArrayParctice;

public class Barray30_B {
	static int product(int[] arr, int l)
	{
		int res = 0;
		int max=1,min=1;
		for(int i=0;i<l;i++)
		{
			if(arr[i]>0)
			{
				max*=arr[i];
			}
			else if(arr[i]==0)
			{
				max=1;
				min=1;
			}
			else
			{
				int temp = max;
				max=min;
				min=temp;
				max=Math.max(arr[i]*max, max);
				min=Math.min(arr[i]*min, min);
			}
			res=Math.max(max, res);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6, -3, -10, 0, 2};
		System.out.print("Maximun Product : "+product(arr,arr.length));
	}

}
