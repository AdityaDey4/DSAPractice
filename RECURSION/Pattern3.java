package RECURSION;

public class Pattern3 {
	int row;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 4; 
		int c = 4;
		Pattern3 ob = new Pattern3();
		ob.row=r;
		ob.printPattern(r,c);
	}
	void printPattern(int r, int c) {
		if(r<=0) {
			return;
		}
		if(c>0) {
			System.out.print("* ");
			printPattern(r,c-1);
		}
		else {
			System.out.println();
			printPattern(r-1,row);
		}
	}
}
