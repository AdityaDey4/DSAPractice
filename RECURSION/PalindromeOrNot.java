package RECURSION;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "racecar";
		char arr[] = s.toCharArray();
		boolean ans = check(arr,0,arr.length-1);
		System.out.print("Palindrome : "+ans);
	}
	static boolean check(char[] arr, int start, int end) {
		if(start > end) {
			return true;
		}
		if(arr[start] != arr[end]) {
			return false;
		}
		if(check(arr,start+1,end-1)==false) {
			return false;
		}
		return true;
	}
}
