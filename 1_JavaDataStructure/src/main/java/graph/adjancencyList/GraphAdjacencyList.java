package graph.adjancencyList;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class GraphAdjacencyList {

    List<GraphNode> graph;

    public GraphAdjacencyList(List<GraphNode> graph) {
        this.graph = graph;
    }

    public void addUndirectedEdgeToList(int i, int j) {
        GraphNode first = graph.get(i);
        GraphNode second = graph.get(j);
        first.getNeighbours().add(second);
        second.getNeighbours().add(first);
    }

    public void addDirectedEdgeToList(int i, int j){
        GraphNode first = graph.get(i);
        GraphNode second = graph.get(j);
        first.getNeighbours().add(second);
    }

    public void topologicalVisit(GraphNode node, Stack<GraphNode> stack){

        for(GraphNode neighbors : node.getNeighbours()){
            if(!neighbors.isVisited()){
                topologicalVisit(neighbors,stack);
            }
        }
        node.setVisited( true);
        stack.push(node);

    }

    public void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : graph){
            if(!node.isVisited()){
                topologicalVisit(node,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().getName()+" ");
        }
    }

    private void bfsVist(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode currentNode = queue.removeFirst();
            currentNode.setVisited(true);
            System.out.print(currentNode.getName()+" ");
            List<GraphNode> neighbors = currentNode.getNeighbours();
            for(GraphNode neighbor: neighbors){
                if (!neighbor.isVisited()){
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void bfs(){
      graph.forEach(node ->{ if(!node.isVisited())bfsVist(node);});
    }


    private void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.setVisited(true);
            System.out.print(currentNode.getName()+" ");
            List<GraphNode> neighbors = currentNode.getNeighbours();
            neighbors.forEach(neighbor -> {
                if (!neighbor.isVisited()){
                    stack.push(neighbor);
                    neighbor.setVisited(true);
                }
            });
        }
    }

    public void dfs(){
        graph.forEach(node ->{ if(!node.isVisited())dfsVisit(node);});
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (GraphNode node : graph) {
            sb.append(node.getName() + " -> ");
            sb.append(node.getNeighbours().stream()
                    .map(neighbour -> neighbour.getName()).collect(Collectors.toList()));
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        List<GraphNode> node = new ArrayList<>();
        node.add(new GraphNode("A", 0));
        node.add(new GraphNode("B", 1));
        node.add(new GraphNode("C", 2));
        node.add(new GraphNode("D", 3));
        node.add(new GraphNode("E", 4));



        GraphAdjacencyList g = new GraphAdjacencyList(node);
        g.addUndirectedEdgeToList(0, 1); // Adding Edges to A to B AND B to A
        g.addUndirectedEdgeToList(0, 2); // Adding Edges to A to C AND C to A
        g.addUndirectedEdgeToList(0, 3); // Adding Edge to A to D AND D to A
        g.addUndirectedEdgeToList(1, 4); // Adding edges to B to E AND E to B
        g.addUndirectedEdgeToList(2, 3); // Adding edges to C to D AND D to C
        g.addUndirectedEdgeToList(3, 4); // Adding Edges to D to E AND E to D

        System.out.println(g);
        g.bfs();

        List<GraphNode> nodes = new ArrayList<>();
        nodes.add(new GraphNode("A", 0));
        nodes.add(new GraphNode("B", 1));
        nodes.add(new GraphNode("C", 2));
        nodes.add(new GraphNode("D", 3));
        nodes.add(new GraphNode("E", 4));
        nodes.add(new GraphNode("F", 5));
        nodes.add(new GraphNode("G", 6));
        nodes.add(new GraphNode("H", 7));

        GraphAdjacencyList topologicalGraph = new GraphAdjacencyList(nodes);
        topologicalGraph.addDirectedEdgeToList(0,2); //Adding Directed edge from A to C
        topologicalGraph.addDirectedEdgeToList(1,2); //Adding Directed edge from B to B
        topologicalGraph.addDirectedEdgeToList(1,3); //Adding Directed edge from B to B
        topologicalGraph.addDirectedEdgeToList(2,4); //Adding Directed edge from C to E
        topologicalGraph.addDirectedEdgeToList(3,5); //Adding Directed edge from D to F
        topologicalGraph.addDirectedEdgeToList(4,5); //Adding Directed edge from E to F
        topologicalGraph.addDirectedEdgeToList(4,7); //Adding Directed edge from E to H
        topologicalGraph.addDirectedEdgeToList(5,6); //Adding Directed edge from F to G

        System.out.println("New Topological Graph");
        System.out.println(topologicalGraph);
        System.out.println("------Topological Sort--------");
        topologicalGraph.topologicalSort();

    }
}
