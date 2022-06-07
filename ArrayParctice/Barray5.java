package ArrayParctice;

public class Barray5 {
	static void rearrange(int arr[], int n)
    {
        int i = -1, temp = 0;
        for (int j = 0; j < n; j++)
        {
            if (arr[j] < 0)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } 
    }
	static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }
	public static void main (String[] args)
    {
        int arr[] = {-1, -1, 2, -2, 3, -3, 4, -4, 5, -5};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        printArray(arr,n);
    }
}
