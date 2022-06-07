package RECURSION;

public class Recursion1 {

	static void printing(int n){
		if(n == 0) {  // Base Condition
			return ;
		}
		System.out.print(n+" "); // Indexing
		printing(n-1); // Hypothisis
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printing(5);
	}

}
