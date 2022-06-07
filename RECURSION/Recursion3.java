package RECURSION;

public class Recursion3 {
	static int fac(int num) {
		if(num == 1) {
			return 1;
		}
		int minus1 = fac(num-1);
		int res = num*minus1;
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fac(5);
		System.out.print(ans);
	}

}
