package O_graph.B_adjacencyMatrix;

import O_graph.node.GraphNode;
import java.util.*;
import java.util.stream.Collectors;

public class AdjacencyMatrixGraph {

  List<GraphNode> graph;
  int[][] graphMatrix;
  int size;

  public AdjacencyMatrixGraph(int size) {
    graph = new LinkedList<>();
    graphMatrix = new int[size][size];
    this.size = size;
  }

  public void addNode(String val, int index) {
    GraphNode node = new GraphNode(val, index);
    graph.add(node);
  }

  public void addUndirectedEdge(int sourceIndex, int targetIndex) {
    graphMatrix[sourceIndex][targetIndex] = 1;
    graphMatrix[targetIndex][sourceIndex] = 1;
  }

  public void addDirectedEdge(int sourceIndex, int targetIndex) {
    graphMatrix[sourceIndex][targetIndex] = 1;
  }

  public List<GraphNode> getNeighbours(GraphNode node) {
    List<GraphNode> neighbours = new ArrayList<>();
    for (int j = 0; j < size; j++) {
      if (graphMatrix[node.index][j] == 1) {
        neighbours.add(graph.get(j));
      }
    }
    return neighbours;
  }

  public void populateNeighbours() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (graphMatrix[i][j] == 1) {
          graph.get(i).neighbours.add(graph.get(j));
        }
      }
    }
  }

  public void bfs() {
    populateNeighbours();
    graph.forEach(
        graphNode ->
            System.out.println(
                "Neighbours of "
                    + graphNode.val
                    + " are : "
                    + graphNode.neighbours.stream()
                        .map(graphNode1 -> graphNode1.val)
                        .collect(Collectors.joining())));
    System.out.println();
    graph.forEach(
        graphNode -> {
          if (!graphNode.isVisited) {
            bfs(graphNode);
          }
        });

    graph.forEach(graphNode -> graphNode.isVisited = false);
    graph.forEach(graphNode -> graphNode.neighbours.clear());
  }

  private void bfs(GraphNode graphNode) {

    Queue<GraphNode> elements = new LinkedList<>();
    elements.offer(graphNode);
    while (!elements.isEmpty()) {
      var currentNode = elements.poll();
      currentNode.isVisited = true;
      System.out.print(currentNode.val + " ");
      var neighbours = getNeighbours(currentNode);
      for (GraphNode neighbour : neighbours) {
        if (!neighbour.isVisited) {
          neighbour.isVisited = true;
          elements.offer(neighbour);
        }
      }
    }
  }

  public void dfs() {
    populateNeighbours();
    graph.forEach(
        graphNode ->
            System.out.println(
                "Neighbours of "
                    + graphNode.val
                    + " are : "
                    + graphNode.neighbours.stream()
                        .map(graphNode1 -> graphNode1.val)
                        .collect(Collectors.joining())));
    System.out.println();
    graph.forEach(
        graphNode -> {
          if (!graphNode.isVisited) {
            dfs(graphNode);
          }
        });

    graph.forEach(graphNode -> graphNode.isVisited = false);
    graph.forEach(graphNode -> graphNode.neighbours.clear());
  }

  public void dfs(GraphNode node) {

    Stack<GraphNode> elements = new Stack<>();
    elements.push(node);
    while (!elements.isEmpty()) {
      var currentNode = elements.pop();
      currentNode.isVisited = true;
      System.out.print(currentNode.val + " ");
      var neighbours = getNeighbours(currentNode);
      for (GraphNode neighbour : neighbours) {
        if (!neighbour.isVisited) {
          neighbour.isVisited = true;
          elements.push(neighbour);
        }
      }
    }
  }

  public void topologicalSort() {

    Stack<GraphNode> elements = new Stack<>();
    graph.forEach(
        graphNode -> {
          if (!graphNode.isVisited) {
            topologicalSort(graphNode, elements);
          }
        });

    while (!elements.isEmpty()) {
      System.out.print(elements.pop().val + " ");
    }

    graph.forEach(graphNode -> graphNode.isVisited = false);
  }

  private void topologicalSort(GraphNode node, Stack<GraphNode> elements) {

    var neighbours = getNeighbours(node);
    for (GraphNode neighbour : neighbours) {
      if (!neighbour.isVisited) {
        topologicalSort(neighbour, elements);
      }
    }
    node.isVisited = true;
    elements.push(node);
  }
}
