package DataStructure.Graph;

import java.util.ArrayList;

import DataStructure.Queue.Queue;

public class AdjacencyList {

	public static void addEdge(int vertexOne, int vertexTwo, ArrayList<ArrayList<Integer>> adjList) {

		adjList.get(vertexOne).add(vertexTwo);
		adjList.get(vertexTwo).add(vertexOne);
	}

	public static void printVertexEdges(ArrayList<ArrayList<Integer>> adjList) {

		for (int i = 0; i < adjList.size(); i++) {
			System.out.println("vertex " + i);
			adjList.get(i).stream().forEach(x -> {
				System.out.println(x);
			});
		}

	}

	// use of stack, but using recursion here
	public static void DFS_traversing(int i, ArrayList<ArrayList<Integer>> adjList) {

		ArrayList<Integer> visited = new ArrayList<>();

		System.out.println("DFS Traversing");
		dfsHelper(i, visited, adjList);

	}

	public static void dfsHelper(int i, ArrayList<Integer> visited, ArrayList<ArrayList<Integer>> adjList) {

		visited.add(i);

		ArrayList<Integer> currentNode = adjList.get(i);
		System.out.println(i);
		for (Integer vertex : currentNode) {

			if (!visited.contains(vertex))
				dfsHelper(vertex, visited, adjList);
		}

	}

	public static void BFS_traversing(int i, ArrayList<ArrayList<Integer>> adjList) {
		Queue toBeVisited = new Queue();
		ArrayList<Integer> visited = new ArrayList<>();
		System.out.println("BFS Traversing");

		helperBfs(i, toBeVisited, visited, adjList);
	}

	private static void helperBfs(int i, Queue toBeVisited, ArrayList<Integer> visited,
			ArrayList<ArrayList<Integer>> adjList) {

		if (!visited.contains(i)) {
			System.out.println(i);
			visited.add(i);
		}

		ArrayList<Integer> currentNode = adjList.get(i);
		currentNode.stream().forEach(x -> {
			if (!visited.contains(x)) {
				System.out.println(x);
				visited.add(x);
				toBeVisited.add(x);
			}

		});

		if (!toBeVisited.isEmpty())
			helperBfs(toBeVisited.remove(), toBeVisited, visited, adjList);
	}

	public static void main(String args[]) {

		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		int vertex = 5;

		for (int i = 0; i < vertex; i++) {
			adjList.add(new ArrayList<>());
		}

		addEdge(0, 1, adjList);
		addEdge(0, 2, adjList);
		addEdge(0, 3, adjList);
		addEdge(1, 2, adjList);
		addEdge(2, 4, adjList);

		System.out.println(adjList.size());

		printVertexEdges(adjList);

		DFS_traversing(0, adjList);

		BFS_traversing(0, adjList);

	}
}
