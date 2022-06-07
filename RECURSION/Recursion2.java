package RECURSION;

public class Recursion2 {
	static void print(int num) {
		if(num == 1) {
			System.out.print(num+" ");
			return ;
		}
		print(num-1);
		System.out.print(num+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
	}

}
