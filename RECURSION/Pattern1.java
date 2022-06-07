package RECURSION;

public class Pattern1 {

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
			System.out.print("* ");
			printPattern(r,c+1);
		}
		else {
			System.out.println();
			printPattern(r-1,0);
		}
		
	}
}
