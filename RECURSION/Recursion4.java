package RECURSION;

public class Recursion4 {
	static int power(int num, int pow) {
		if( pow == 0) {
			return 1;
		}
		if(pow == 1) {
			return num;
		}
		int minus1 = power(num,pow-1);
		int res = minus1*num;
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(power(4,4));
	}

}
