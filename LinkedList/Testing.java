package LinkedList;

public class Testing { 
	public static void main(String[] args) {
		method1();
	}
	static void method1() {
		int[] arr = new int[2];
		arr[0]=1;
		arr[1]=2;
		method2(arr,arr.length);
	}
	static void method2(int[] a, int len) {
		int sum=0;
		for(int i=0;i<len;i++) {
			sum=sum+a[i];
		}
		System.out.print(sum);
	}
}