package RECURSION;

public class Recursion5 {
	static int data = 1;
	static int fibonacci(int num) {
		if(num == 1) {
			System.out.print(1+" ");
			return 1;
		}//FIBONACCI SERIES
		int rec = fibonacci(num-1);
		int prev=data;
		data=data+rec;
		System.out.print(data+" ");
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		if(num == 1) {
			System.out.print(0+" ");
			num = num-1;
		}
		else {
			System.out.print(0+" ");
			System.out.print(1+" ");
			num = num-2;
		}
		if(num>0) {
			fibonacci(num);
		}
	}

}
