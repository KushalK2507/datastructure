package graph.adjancencyMatrix;

import graph.adjancencyList.GraphAdjacencyList;
import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GraphAdjacencyMatrix {
    List<GraphNode> graph;
    int[][] adjacencyMatrix;

    public GraphAdjacencyMatrix(List<GraphNode> graphNodeList) {
        this.graph = graphNodeList;
        adjacencyMatrix = new int[graphNodeList.size()][graphNodeList.size()];
    }

    public void addUndirectedEdgesToAdjacencyMatrix(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }
    protected ArrayList<GraphNode> getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.getIndex();
        for (int i=0;i<adjacencyMatrix[nodeIndex].length;i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                neighbors.add(graph.get(i));
            }
        }
        return neighbors;
    }
    private void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.removeFirst();
            currentNode.setVisited(true);
            System.out.print(currentNode.getName()+" ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for(GraphNode neighbor: neighbors){
                if(!neighbor.isVisited()){
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }
    public void bfs(){
        graph.forEach(node ->{ if(!node.isVisited())bfsVisit(node);});
    }

    private void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.setVisited(true);
            System.out.print(currentNode.getName()+" ");
            List<GraphNode> neighbors = getNeighbors(currentNode);
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

        sb.append("   ");
        for (GraphNode node : graph) {
            sb.append(node.getName() + " ");
        }
        sb.append("\n");
        for (int i = 0; i < graph.size(); i++) {
            sb.append(graph.get(i).getName() + ": ");
            for (int j : adjacencyMatrix[i]) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addDirectedEdgesToGraphicalMatrix(int i, int j){
        adjacencyMatrix[i][j] =1;
    }

    public void topologicalVisit(GraphNode node, Stack<GraphNode> stack){
        for(GraphNode neighbor: getNeighbors(node)){
            if(!neighbor.isVisited()){
                topologicalVisit(neighbor,stack);
            }
        }
        node.setVisited(true);
        stack.push(node);
    }

    //Topological Sort
    public void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        for(GraphNode node : graph){
            if(!node.isVisited()){
                topologicalVisit(node,stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().getName()+" ");
        }
    }


    public static void main(String[] args) {

        List<GraphNode> node = new ArrayList<>();
        node.add(new GraphNode("A", 0));
        node.add(new GraphNode("B", 1));
        node.add(new GraphNode("C", 2));
        node.add(new GraphNode("D", 3));
        node.add(new GraphNode("E", 4));

        GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(node);
        g.addUndirectedEdgesToAdjacencyMatrix(0, 1); // Adding Edges to A to B AND B to A
        g.addUndirectedEdgesToAdjacencyMatrix(0, 2); // Adding Edges to A to C AND C to A
        g.addUndirectedEdgesToAdjacencyMatrix(0, 3); // Adding Edge to A to D AND D to A
        g.addUndirectedEdgesToAdjacencyMatrix(1, 4); // Adding edges to B to E AND E to B
        g.addUndirectedEdgesToAdjacencyMatrix(2, 3); // Adding edges to C to D AND D to C
        g.addUndirectedEdgesToAdjacencyMatrix(3, 4); // Adding Edges to D to E AND E to D

        System.out.println(g);

//        System.out.println("--------BFS------");
//        g.bfs();

        System.out.println("--------DFS------");
        g.dfs();


        List<GraphNode> nodes = new ArrayList<>();
        nodes.add(new GraphNode("A", 0));
        nodes.add(new GraphNode("B", 1));
        nodes.add(new GraphNode("C", 2));
        nodes.add(new GraphNode("D", 3));
        nodes.add(new GraphNode("E", 4));
        nodes.add(new GraphNode("F", 5));
        nodes.add(new GraphNode("G", 6));
        nodes.add(new GraphNode("H", 7));

        GraphAdjacencyMatrix topologicalGraph = new GraphAdjacencyMatrix(nodes);
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(0,2); //Adding Directed edge from A to B
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(1,2); //Adding Directed edge from B to B
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(1,3); //Adding Directed edge from B to B
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(2,4); //Adding Directed edge from C to E
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(3,5); //Adding Directed edge from D to F
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(4,5); //Adding Directed edge from E to F
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(4,7); //Adding Directed edge from E to H
        topologicalGraph.addDirectedEdgesToGraphicalMatrix(5,6); //Adding Directed edge from F to G

        System.out.println("New Topological Graph");
        System.out.println(topologicalGraph);

        topologicalGraph.topologicalSort();

    }
}
