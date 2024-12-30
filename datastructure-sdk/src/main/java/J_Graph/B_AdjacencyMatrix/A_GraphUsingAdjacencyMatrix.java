package J_Graph.B_AdjacencyMatrix;

import java.util.LinkedList;
import java.util.List;

public class A_GraphUsingAdjacencyMatrix {

  List<Integer> graph;
  int[][] matrix;
  int size;

  public A_GraphUsingAdjacencyMatrix(int size) {
    graph = new LinkedList<>();
    matrix = new int[size][size];
    this.size = size;
  }

  public void addNode(String value, int index) {}

  public void addUndirectedEdge(int source, int target) {}

  public void addDirectedEdge(int source, int target) {}

  public void bfs() {}

  public void dfs() {}

  public void topologicalSort() {}
}
