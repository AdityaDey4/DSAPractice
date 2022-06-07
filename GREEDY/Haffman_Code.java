package GREEDY;
import java.util.*;
class MyData {
	int data;
	char c;
	MyData left;
	MyData right;
	
	MyData(int d, char c){
		this.data = d;
		this.c = c;
	}

	
}
class MyComparator implements Comparator<MyData>{
	@Override
	public int compare(MyData o1, MyData o2) {
		// TODO Auto-generated method stub
		return o1.data - o2.data;
	}
}
public class Haffman_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = {'e', 'b', 'c', 'd', 'f', 'a'};
		int frequency[] = {16, 9, 12, 13, 45, 5};
		
		haffmanCoding(ch, frequency);
	}
	static void haffmanCoding(char[] ch, int[] frequency) {
		
		PriorityQueue<MyData> al = new PriorityQueue<MyData>(new MyComparator());
		for(int i=0; i<ch.length; i++) {
			al.offer(new MyData(frequency[i], ch[i]));
		}
		
		MyData root = null;
		while(al.size() > 1) {
			MyData left = al.poll();
			MyData right = al.poll();
			
			int curr_data = left.data + right.data;
			MyData curr = new MyData(curr_data, '-');
			
			curr.left = left;
			curr.right = right;
			
			root = curr;
			al.offer(curr);
		}
		printCode(root, "");
	}
	static void printCode(MyData root, String code) {
		if(root.left == null && root.right == null && Character.isLetter(root.c)) {
			System.out.println(root.c+" : "+code);
			return ;
		}
		printCode(root.left, code+"0");
		printCode(root.right, code+"1");
	}
}
