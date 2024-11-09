package graph.bellmanFord;

import graph.node.WeightedGraphNode;

import java.util.ArrayList;
import java.util.List;

public class BellmanFordAlgoGraph {

    private List<WeightedGraphNode> graph;
    private boolean pathFound;


    public BellmanFordAlgoGraph(List<WeightedGraphNode> nodes) {
        this.graph = nodes;
    }

    private void addWeightedDirectedEdge(int i, int j, int weight) {
        WeightedGraphNode first = graph.get(i);
        WeightedGraphNode second = graph.get(j);
        first.getNeighbours().add(second);
        first.getWeightedMap().put(second, weight);
    }

    private void bellmanFordAlgo(WeightedGraphNode source, WeightedGraphNode target) {
        pathFound = false;
        source.setDistance(0);
        for (int i = 0; i < graph.size() - 1; i++) {
            for (WeightedGraphNode node : graph) {
                for (WeightedGraphNode neighbour : node.getNeighbours()) {
                    if (node.getDistance() != Integer.MAX_VALUE && neighbour.getDistance() > node.getDistance() + node.getWeightedMap().get(neighbour)) {
                        neighbour.setParent(node);
                        neighbour.setDistance(node.getDistance() + node.getWeightedMap().get(neighbour));
                    }
                }}}

        System.out.println("Checking for Negative Cycle");
        for (WeightedGraphNode node : graph) {
            for (WeightedGraphNode neighbour : node.getNeighbours()) {
                if (neighbour.getDistance() > node.getDistance() + node.getWeightedMap().get(neighbour)) {
                    System.out.println("Negative Cycle is present between " + node + " to " + neighbour + " with value " + node.getWeightedMap().get(neighbour));
                    return;
                }}}

        for (WeightedGraphNode node : graph) {
            if (node.getName().equals(target.getName())) {
                System.out.print(" Path between the " + source.getName() + " to " + target + " with distance " + target.getDistance() + " and Path: ");
                printPath(source, node);
            }}

    }

    private void printPath(WeightedGraphNode source, WeightedGraphNode target) {

        if (target.getParent() != null && !source.getName().equals(target.getName())) {
            pathFound = true;
            printPath(source, target.getParent());
        }
        if (pathFound) {
            System.out.print(target.getName() + " ");
        }
    }


    public static void main(String[] args) {

        List<WeightedGraphNode> nodes = new ArrayList<>();
        nodes.add(new WeightedGraphNode("A", 0));
        nodes.add(new WeightedGraphNode("B", 1));
        nodes.add(new WeightedGraphNode("C", 2));
        nodes.add(new WeightedGraphNode("D", 3));
        nodes.add(new WeightedGraphNode("E", 4));

        BellmanFordAlgoGraph g = new BellmanFordAlgoGraph(nodes);
        g.addWeightedDirectedEdge(0, 2, 6); //Edge from A to C with weight 6
        g.addWeightedDirectedEdge(0, 3, -6); //Edge from A to C with weight -6
        g.addWeightedDirectedEdge(1, 0, 3); //Edge from B to A with weight 3
        g.addWeightedDirectedEdge(2, 3, 1); //Edge from C to D with weight 1
        g.addWeightedDirectedEdge(3, 1, 1); //Edge from D to B with weight 1
        g.addWeightedDirectedEdge(3, 2, 2); //Edge from D to C with weight 2
        g.addWeightedDirectedEdge(4, 1, 4); //Edge from E to B with weight 4
        g.addWeightedDirectedEdge(4, 3, 2); //Edge from E to D with weight 2


        g.bellmanFordAlgo(nodes.get(4), nodes.get(0));
        if (!g.pathFound) {
            System.out.print("No Path found between E to A");
        }
        System.out.println();

        g.bellmanFordAlgo(nodes.get(4), nodes.get(1));
        if (!g.pathFound) {
            System.out.print("No Path found between E to B");
        }
        System.out.println();

        g.bellmanFordAlgo(nodes.get(4), nodes.get(2));
        if (!g.pathFound) {
            System.out.print("No Path found between E to C");
        }
        System.out.println();

        g.bellmanFordAlgo(nodes.get(4), nodes.get(3));
        if (!g.pathFound) {
            System.out.print("No Path found between E to D");
        }
        System.out.println();

        g.bellmanFordAlgo(nodes.get(4), nodes.get(4));
        if (!g.pathFound) {
            System.out.print("No Path found between E to E");
        }
        System.out.println();


    }
}
