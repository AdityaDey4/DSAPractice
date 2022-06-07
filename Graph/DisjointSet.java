package Graph;

public class DisjointSet {
	int[] rank,parent;
	int V;
	DisjointSet(int v){
		rank = new int[v+1];
		parent = new int[v+1];
		this.V=v;
		makeSet();
	}
	void makeSet() {
		for(int i=1;i<=V;i++) {
			parent[i]=i;
			rank[i]=0;
		}
	}
	int findPar(int data) {
		if(parent[data]==data) {
			return parent[data];
		}
		return parent[data]=findPar(parent[data]);
	}
	void unoin(int a, int b) {
		if(rank[a]>rank[b]) {
			parent[b]=a;
		}
		else if(rank[b]>rank[a]) {
			parent[a]=b;
		}
		else {
			parent[b]=a;
			rank[a]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisjointSet ob = new DisjointSet(5);
		ob.unoin(1, 2);
		ob.unoin(4, 5);
		ob.unoin(5, 3);
		System.out.println("Parent of 3 : "+ob.findPar(3));
		int a=3,b=4;
		if(ob.findPar(a) == ob.findPar(b)) {
			System.out.println(a+" "+b+" is in same set");
		}else {
			System.out.println(a+" & "+b+" is not in same set");
		}
	}

}
