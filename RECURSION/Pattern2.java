package RECURSION;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4;
		printPattern(r,0);
	}
	static void printPattern(int r, int c) {
		if(r<=0) {
			return;
		}
		if(c<r) {
			printPattern(r,c+1);
			System.out.print("* ");
		}
		else {
			printPattern(r-1,0);
			System.out.println();
		}
	}
}
