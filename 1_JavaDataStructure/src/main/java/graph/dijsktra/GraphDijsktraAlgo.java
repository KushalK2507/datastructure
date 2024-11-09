package graph.dijsktra;

import graph.node.WeightedGraphNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class GraphDijsktraAlgo {

    List<WeightedGraphNode> graph;
    boolean pathFound;

    public GraphDijsktraAlgo(List<WeightedGraphNode> nodes) {
        graph = nodes;
    }

    public void addWeightedDirectedEdge(int i, int j, int weight) {
        WeightedGraphNode first = graph.get(i);
        WeightedGraphNode second = graph.get(j);
        first.getNeighbours().add(second);
        first.getWeightedMap().put(second, weight);
    }

    public void dijsktraAlgo(WeightedGraphNode node, String source, String target) {
        pathFound = false;
        PriorityQueue<WeightedGraphNode> queue = new PriorityQueue<>();
        node.setDistance(0);
        queue.addAll(graph);
        while (!queue.isEmpty()) {
            WeightedGraphNode current = queue.remove();
            List<WeightedGraphNode> neighbours = current.getNeighbours();
            for (WeightedGraphNode neighbour : neighbours) {
                if (neighbour.getDistance() > current.getDistance() + current.getWeightedMap().get(neighbour)) {
                    neighbour.setDistance(current.getDistance() + current.getWeightedMap().get(neighbour));
                    neighbour.setParent(current);
                    queue.remove(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        for (WeightedGraphNode graphNode : graph) {
            if (graphNode.getName().equals(target)) {
                System.out.print("Path from " + source + " to " + target +
                        " having distance " + graphNode.getDistance() + " Path is: ");
                printPath(graphNode, source);

            }
        }
    }

    private void printPath(WeightedGraphNode node, String source) {

        if (node.getParent() != null && !node.getName().equals(source)) {
            pathFound = true;
            printPath(node.getParent(), source);
        }
        if(pathFound){
            System.out.print(node.getName()+" ");
        }
    }


    public static void main(String[] args) {

        List<WeightedGraphNode> nodes = new ArrayList<>();
        nodes.add(new WeightedGraphNode("A", 0));
        nodes.add(new WeightedGraphNode("B", 1));
        nodes.add(new WeightedGraphNode("C", 2));
        nodes.add(new WeightedGraphNode("D", 3));
        nodes.add(new WeightedGraphNode("E", 4));
        nodes.add(new WeightedGraphNode("F", 5));
        nodes.add(new WeightedGraphNode("G", 6));

        GraphDijsktraAlgo g = new GraphDijsktraAlgo(nodes);
        g.addWeightedDirectedEdge(0, 1, 2); // Adding Edge from A to B with Weight 2
        g.addWeightedDirectedEdge(0, 2, 5); // Adding Edge from A to C with Weight 5
        g.addWeightedDirectedEdge(1, 2, 6); // Adding Edge from B to C with Weight 6
        g.addWeightedDirectedEdge(1, 3, 1); // Adding Edge from B to D with Weight 1
        g.addWeightedDirectedEdge(1, 4, 3); // Adding Edge from B to E with Weight 3
        g.addWeightedDirectedEdge(2, 5, 8); // Adding Edge from C to F with Weight 8
        g.addWeightedDirectedEdge(3, 4, 4); // Adding Edge from D to E with Weight 4
        g.addWeightedDirectedEdge(4, 6, 9); // Adding Edge from E to G with Weight 9
        g.addWeightedDirectedEdge(5, 6, 7); // Adding Edge from F to G with Weight 7

        //Checking the Path between A to F using Dijsktra's Algo
        g.dijsktraAlgo(nodes.get(0), "A", "G");
        if (!g.pathFound) {
            System.out.print("No Path found between A to F");
        }
        System.out.println();

        g.dijsktraAlgo(nodes.get(0), "D", "F");
        if (!g.pathFound) {
            System.out.print("No Path found between D to F");
        }
        System.out.println();

        g.dijsktraAlgo(nodes.get(0), "A", "C");
        if (!g.pathFound) {
            System.out.print("No Path found between A to C");
        }
        System.out.println();

        g.dijsktraAlgo(nodes.get(0), "B", "E");
        if (!g.pathFound) {
            System.out.print("No Path found between B to E");
        }
        System.out.println();

        g.dijsktraAlgo(nodes.get(0), "F", "A");
        if (!g.pathFound) {
            System.out.print("No Path found between F to A");
        }
        System.out.println();

    }
}
