package graph.adjancencyList;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphAdjacencyListBFSForSSSPP extends GraphAdjacencyList {

    public boolean pathFound;

    public GraphAdjacencyListBFSForSSSPP(List<GraphNode> graph) {

        super(graph);
        this.pathFound=false;
    }

    public static void main(String[] args) {

        //Below graph is created SSSPP for given Source to Target

        List<GraphNode> node1 = new ArrayList<>();
        node1.add(new GraphNode("A", 0));
        node1.add(new GraphNode("B", 1));
        node1.add(new GraphNode("C", 2));
        node1.add(new GraphNode("D", 3));
        node1.add(new GraphNode("E", 4));

        GraphAdjacencyListBFSForSSSPP g1 = new GraphAdjacencyListBFSForSSSPP(node1);
        g1.addUndirectedEdgeToList(0, 1); // Adding Edges to A to B AND B to A
        g1.addUndirectedEdgeToList(0, 2); // Adding Edges to A to C AND C to A
        g1.addUndirectedEdgeToList(0, 3); // Adding Edge to A to D AND D to A
        g1.addUndirectedEdgeToList(1, 4); // Adding edges to B to E AND E to B
        g1.addUndirectedEdgeToList(2, 3); // Adding edges to C to D AND D to C
        g1.addUndirectedEdgeToList(3, 4); // Adding Edges to D to E AND E to D

        String source = "A";
        String target = "E";
        g1.bfsForSSSPP(source, target);

        if(!g1.pathFound){
            System.out.println("No Path found between "+source+" to "+target);
        }
    }

    public void bfsForSSSPP(String source, String target) {

        graph.forEach(g -> {
            if (!g.isVisited()) {
                bfsForSSSPPVist(g, source, target);
            }
        });
    }
    private void bfsForSSSPPVist(GraphNode node, String source, String target) {

        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode node1 = queue.removeFirst();
            node1.setVisited(true);
            List<GraphNode> neighbours = node1.getNeighbours();
            neighbours.forEach(neighbor -> {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                    neighbor.setParentNode(node1);
                }
            });
            if (node1.getName().equals(target)) {
                pathFound = true;
                System.out.println("Printing the Path from " + source + " to " + target);
                printPath(node1, source);
            }
        }
    }

    private void printPath(GraphNode node, String source) {

        if (node.getParentNode() != null && !node.getName().equals(source)) {
            System.out.print(node.getName() + " -> ");
            printPath(node.getParentNode(), source);
        } else {
            System.out.print(node.getName());
        }

    }
}
