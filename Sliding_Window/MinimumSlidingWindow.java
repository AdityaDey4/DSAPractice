package Sliding_Window;
import java.util.*;
public class MinimumSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumSlidingWindow ob = new MinimumSlidingWindow();
		String s = "ADOBECODEBANC", t = "ABC";
		String ans = ob.minWindow(s, t);
		System.out.print(ans);
	}
	public String minWindow(String s, String t) {
        int i=0,flag =0, j;
        String ans = "";
        int len = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(j=0; j<t.length(); j++){
            char c = t.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int count = map.size();
        for(j=0; j<s.length(); j++){
            char c = s.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0){
                    count--;
                }
            }
            if(count == 0){
                
                while(count ==0){
                    char ch = s.charAt(i++);
                    if(map.containsKey(ch)){
                        map.put(ch, map.get(ch)+1);
                        if(map.get(ch) > 0){
                            count++;       
                        }
                    }          
                }
                if(len>j+1-i+1){
                    ans = s.substring(i-1,j+1);
                    len = ans.length();
                }
                flag =i;
            }           
        }
        return ans;
    }
}
