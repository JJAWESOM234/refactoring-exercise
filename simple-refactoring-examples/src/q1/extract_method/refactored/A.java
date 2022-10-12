package q1.extract_method.refactored;

import java.util.List;

public class A {
	Node m1(List<Node> nodes, String p) {
		// TODO: Your answer
		printObject(nodes, p);
		// other implementation
		return null;
	}

	Edge m2(List<Edge> edgeList, String p) {
		// TODO: Your answer
		printObject(edgeList, p);
		// other implementation
		return null;
	}

	// TODO: Your answer
	private <E extends Graph> void printObject(List<E> stringList, String p) {
		for (E node : stringList) {
			if (node.contains(p))
				System.out.println(node);
		}
	}
}

class Graph {
	String name;

	boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Graph {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Edge extends Graph {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}