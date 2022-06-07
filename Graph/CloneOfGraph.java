package Graph;

import java.util.*;

class GraphNode{
	
	int value;
	ArrayList<GraphNode> al;
	GraphNode(){}
	GraphNode(int val){
		this.value = val;
		al = new ArrayList<GraphNode>();
	}
	
	GraphNode buildGraph() {
		GraphNode node1 = new GraphNode(1);
		GraphNode node2 = new GraphNode(2);
		GraphNode node3 = new GraphNode(3);
		GraphNode node4 = new GraphNode(4);
		
		ArrayList<GraphNode> al = new ArrayList<GraphNode>();
		al.add(node2);
		al.add(node4);
		node1.al = al;
		
		al = new ArrayList<GraphNode>();
		al.add(node1);
		al.add(node3);
		node2.al = al;
		
		al = new ArrayList<GraphNode>();
		al.add(node2);
		al.add(node4);
		node3.al = al;
		
		al = new ArrayList<GraphNode>();
		al.add(node1);
		al.add(node3);
		node4.al = al;
		
		return node1;
	}
	
	void PrintGraph(GraphNode source) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(source);
		
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		map.put(source.value, true);
		
		while(queue.isEmpty() == false) {
			
			GraphNode curr = queue.poll();
			System.out.println("Data of the Node : "+curr.value);
			System.out.println("Address of its neighbors : "+curr.al);
			
			for(GraphNode gn : curr.al) {
				
				if(! map.containsKey(gn.value)) {
					queue.add(gn);
					map.put(gn.value, true);
				}
			}
		}
	}
	GraphNode cloneGraph(GraphNode source) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(source);
		
		HashMap<GraphNode,GraphNode> map = new HashMap<GraphNode,GraphNode>();
		map.put(source,new GraphNode(source.value));
		
		while(! queue.isEmpty()) {
			
			GraphNode curr = queue.poll();
			GraphNode cloneNode = map.get(curr);
			
			if(curr.al != null) {
				ArrayList<GraphNode> currAl = curr.al;
				for(GraphNode gn : currAl) {
					
					if(map.containsKey(gn)) {
						cloneNode.al.add(map.get(gn));
					}else {
						map.put(gn, new GraphNode(gn.value));
						cloneNode.al.add(map.get(gn));
						queue.add(gn);
					}
				}
			}
		}
		return map.get(source);
	}
	
}
public class CloneOfGraph {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphNode ob = new GraphNode();
		GraphNode source = ob.buildGraph();
		ob.PrintGraph(source);
		System.out.println();
		System.out.println();
		GraphNode newSource = ob.cloneGraph(source);
		ob.PrintGraph(newSource);
	}

}
