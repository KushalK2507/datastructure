package O_graph;

import O_graph.A_adjacencyList.AdjacencyListGraph;
import O_graph.B_adjacencyMatrix.AdjacencyMatrixGraph;
import O_graph.C_DijsktraAlgo.DijsktraAlgo;

public class GraphTester {

  public static void main(String[] args) {

    // Adjacency List of Undirected Graph
    adjacencyListUndirectedGraph();

    // Adjacency List of Directed Graph (Topological Sort)
    adjacencyListDirectedGraph();

    // Adjacency Matrix for Undirected Graph
    adjacencyMatrixUndirectedGraph();

    // Adjacency matrix for Directed Graph (Topological Sort)
    adjacencyMatrixDirectedGraph();

    // Dijsktra Algo
    dijsktraAlgo();

    // Bellman Ford
    bellmanFord();
  }

  private static void bellmanFord() {}

  private static void dijsktraAlgo() {

    DijsktraAlgo dijsktraAlgo = new DijsktraAlgo();
    dijsktraAlgo.addNode("A", 0);
    dijsktraAlgo.addNode("B", 1);
    dijsktraAlgo.addNode("C", 2);
    dijsktraAlgo.addNode("D", 3);
    dijsktraAlgo.addNode("E", 4);
    dijsktraAlgo.addNode("F", 5);
    dijsktraAlgo.addNode("G", 6);

    dijsktraAlgo.addDirectedEdges(0, 1, 2);
    dijsktraAlgo.addDirectedEdges(0, 2, 5);
    dijsktraAlgo.addDirectedEdges(1, 2, 6);
    dijsktraAlgo.addDirectedEdges(1, 3, 1);
    dijsktraAlgo.addDirectedEdges(1, 4, 3);
    dijsktraAlgo.addDirectedEdges(2, 5, 8);
    dijsktraAlgo.addDirectedEdges(3, 4, 4);
    dijsktraAlgo.addDirectedEdges(4, 6, 9);
    dijsktraAlgo.addDirectedEdges(5, 6, 7);

    dijsktraAlgo.dijsktraAlgo("A", "G");
    System.out.println();
    System.out.println("------------------");
  }

  private static void adjacencyMatrixDirectedGraph() {

    AdjacencyMatrixGraph directedMatrixGraph = new AdjacencyMatrixGraph(8);
    directedMatrixGraph.addNode("A", 0);
    directedMatrixGraph.addNode("B", 1);
    directedMatrixGraph.addNode("C", 2);
    directedMatrixGraph.addNode("D", 3);
    directedMatrixGraph.addNode("E", 4);
    directedMatrixGraph.addNode("F", 5);
    directedMatrixGraph.addNode("G", 6);
    directedMatrixGraph.addNode("H", 7);

    directedMatrixGraph.addDirectedEdge(0, 2);
    directedMatrixGraph.addDirectedEdge(1, 2);
    directedMatrixGraph.addDirectedEdge(1, 3);
    directedMatrixGraph.addDirectedEdge(2, 4);
    directedMatrixGraph.addDirectedEdge(3, 5);
    directedMatrixGraph.addDirectedEdge(4, 5);
    directedMatrixGraph.addDirectedEdge(4, 7);
    directedMatrixGraph.addDirectedEdge(5, 6);

    System.out.println("Topological Sort of Adjacency matrix: ");
    directedMatrixGraph.topologicalSort();
    System.out.println();
    System.out.println("----------------------");
  }

  private static void adjacencyMatrixUndirectedGraph() {

    AdjacencyMatrixGraph undirectedGraph = new AdjacencyMatrixGraph(5);
    undirectedGraph.addNode("A", 0);
    undirectedGraph.addNode("B", 1);
    undirectedGraph.addNode("C", 2);
    undirectedGraph.addNode("D", 3);
    undirectedGraph.addNode("E", 4);

    undirectedGraph.addUndirectedEdge(0, 1);
    undirectedGraph.addUndirectedEdge(0, 2);
    undirectedGraph.addUndirectedEdge(0, 3);
    undirectedGraph.addUndirectedEdge(1, 4);
    undirectedGraph.addUndirectedEdge(2, 3);
    undirectedGraph.addUndirectedEdge(3, 4);

    System.out.println("BFS using Adjacency Matrix of Undirected Graph: ");
    undirectedGraph.bfs();
    System.out.println();
    System.out.println("----------------------");

    System.out.println("DFS using Adjacency Matrix of Undirected Graph: ");
    undirectedGraph.dfs();
    System.out.println();
    System.out.println("----------------------");
  }

  private static void adjacencyListDirectedGraph() {

    AdjacencyListGraph directedGraph = new AdjacencyListGraph();
    directedGraph.addNode("A", 0);
    directedGraph.addNode("B", 1);
    directedGraph.addNode("C", 2);
    directedGraph.addNode("D", 3);
    directedGraph.addNode("E", 4);
    directedGraph.addNode("F", 5);
    directedGraph.addNode("G", 6);
    directedGraph.addNode("H", 7);

    directedGraph.addDirectedEdges(0, 2);
    directedGraph.addDirectedEdges(1, 2);
    directedGraph.addDirectedEdges(1, 3);
    directedGraph.addDirectedEdges(2, 4);
    directedGraph.addDirectedEdges(3, 5);
    directedGraph.addDirectedEdges(4, 5);
    directedGraph.addDirectedEdges(4, 7);
    directedGraph.addDirectedEdges(5, 6);

    System.out.print("Topological Sort using Adjacency List of Directed Graph: ");
    directedGraph.topologicalSort();
    System.out.println();
    System.out.println("----------------------");
  }

  private static void adjacencyListUndirectedGraph() {

    AdjacencyListGraph undirectedGraph = new AdjacencyListGraph();
    undirectedGraph.addNode("A", 0);
    undirectedGraph.addNode("B", 1);
    undirectedGraph.addNode("C", 2);
    undirectedGraph.addNode("D", 3);
    undirectedGraph.addNode("E", 4);

    undirectedGraph.addUndirectedEge(0, 1);
    undirectedGraph.addUndirectedEge(0, 2);
    undirectedGraph.addUndirectedEge(0, 3);
    undirectedGraph.addUndirectedEge(1, 4);
    undirectedGraph.addUndirectedEge(3, 4);

    System.out.print("BFS using Adjacency List of Undirected Graph: ");
    undirectedGraph.bfs();
    System.out.println();
    System.out.println("----------------------");

    System.out.print("DFS using Adjacency List of Undirected Graph: ");
    undirectedGraph.dfs();
    System.out.println();
    System.out.println("----------------------");
  }
}
