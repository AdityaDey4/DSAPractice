package ArrayParctice;

public class Array9 {
	public int countRotation(int arr[], int l)
	{
		int min_index = 0,min_value = arr[0];
		for(int i=0;i<l;i++)
		{
			if(min_value>arr[i])
			{
				min_value=arr[i];
				min_index=i;
			}
		}
		return min_index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= new int[] {5,6,7,8,1,2};
		Array9 a = new Array9();
		System.out.println("Answer is : "+a.countRotation(array,array.length-1));
	}

}
