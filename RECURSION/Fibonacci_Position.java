package RECURSION;

public class Fibonacci_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=11;
		int ans = fibonacci(i);
		System.out.print("In fibonacci series at index "+i+" the number is : "+ans);
		
	}
	static int fibonacci(int data) {
		if(data==0) {
			return 0;
		}
		if(data==1) {
			return 1;
		}
		int left = fibonacci(data-2);
		int right = fibonacci(data-1);
		return left+right;
	}
}
