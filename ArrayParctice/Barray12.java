package ArrayParctice;

public class Barray12 {
	static int[] a = {0,8,8,10,0,3,6,6};
	static int l = a.length;
	static void moveZeroEnd()
	{
		int index =0;
		for(int i=0;i<l;i++)
		{
			if(a[i]!=0)
			{
				a[index]=a[i];
				index++;
			}
		}
		while(index<l)
		{
			a[index]=0;
			index++;
		}
	}
	static void reArrange()
	{
		for(int i=0;i<l;i++)
		{
			if(a[i]!=0 && a[i]==a[i+1])
			{
				a[i]=2*a[i];
				a[i+1]=0;
			}
		}
		moveZeroEnd();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reArrange();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
