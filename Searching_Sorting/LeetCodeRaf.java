package Searching_Sorting;
import java.util.*;
class Pair implements Comparable<Pair>{
    char ch;
    int fre;
    Pair(char c, int f){
        this.ch = c;
        this.fre = f;
    }
    public int compareTo(Pair p){
        if(p.fre == this.fre){
            return this.ch-p.ch;
        }
        return p.fre-this.fre;
    }
}
public class LeetCodeRaf {

	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(4%10);;
		System.out.println(gcd(-2,2));
		
		
	}
	static int gcd(int a, int b) {
		
		if(b==0) return a;
		
		return gcd(b, a%b);
	}
	static ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String> al = new ArrayList<>();
        dfs(0, "", S, al);
        
        return al;
    }
    static void dfs(int index, String ans, String s, ArrayList<String> al){
        if(index == s.length()-1){
            ans+=s.charAt(index);
            al.add(ans);
            return;
        }
        ans = ans+s.charAt(index);
        dfs(index+1, ans, s, al);
        
        dfs(index+1, ans+" ", s, al);
    }
}
