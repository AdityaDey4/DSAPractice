package ArrayParctice;

public class Carray23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0, 1, 2, 6, 9};
		int n = a.length;
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i]!=i)
			{
				break;
			}
		}
		System.out.print(i);
	}

}
