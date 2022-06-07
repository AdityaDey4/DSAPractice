package ArrayParctice;

public class Barray14 {
	static int[] arr= {6 , -5, 3, -2, -1};
	static void rotrate()
	{
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=arr[i]+arr[index];
				arr[index]=arr[i]-arr[index];
				arr[i]=arr[i]-arr[index];
				index++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotrate();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
