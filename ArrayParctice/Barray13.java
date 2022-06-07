package ArrayParctice;

public class Barray13 {
	static void arrange(int[] arr, int[] index)
	{
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			temp[index[i]]=arr[i];
		}
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=temp[j];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10, 40, 70 , 20, 30};
		int[] index = {0, 3, 4, 1, 2};
		arrange(a,index);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
