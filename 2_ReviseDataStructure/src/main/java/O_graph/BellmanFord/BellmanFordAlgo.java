package O_graph.BellmanFord;

import O_graph.node.WeightedGraphNode;

import java.util.ArrayList;
import java.util.List;

public class BellmanFordAlgo {

    List<WeightedGraphNode> graph;

    public BellmanFordAlgo(){
        graph = new ArrayList<>();
    }

    public void addNode(String val,int index){
        graph.add(new WeightedGraphNode(val,index));
    }

    public void addDirectedEdges(int sourceIndex, int targetIndex, int weight){

        var sourceNode = graph.stream().filter(weightedGraphNode -> weightedGraphNode.index == sourceIndex).findFirst().orElse(null);
        var targetNode = graph.stream().filter(weightedGraphNode -> weightedGraphNode.index == targetIndex).findFirst().orElse(null);

        if (sourceNode!= null && targetNode!=null){
            sourceNode.neighbours.add(targetNode);
            sourceNode.weightGraph.put(targetNode,weight);
        }
    }


    public void bellmanFordAlgo(WeightedGraphNode source, WeightedGraphNode target){

        source.distance = 0;
        for (int i=0;i<graph.size()-1;i++){
            for (WeightedGraphNode graphNode : graph) {
                for (WeightedGraphNode neighbour : graphNode.neighbours) {
                    if (neighbour.distance != Integer.MAX_VALUE && neighbour.distance > graphNode.distance + graphNode.weightGraph.get(neighbour)) {
                        neighbour.parent = graphNode;
                        neighbour.distance = graphNode.distance + graphNode.weightGraph.get(neighbour);
                    }
                }
            }
        }

        //Checking for Negative Cycles
        for (WeightedGraphNode graphNode:graph){
            for (WeightedGraphNode neighbour: graphNode.neighbours){
                if (neighbour.distance > graphNode.distance+graphNode.weightGraph.get(neighbour)){
                    System.out.print("Graph has Negative Cycle");
                    break;
                }
            }
        }
        for (WeightedGraphNode graphNode:graph){
            if (graphNode.val.equals(target.val)){
                if (graphNode.distance == Integer.MAX_VALUE) {
                    System.out.println("No path exists from source: " + source.val + " to target: " + target.val);
                } else {
                    System.out.print("Path exists from source: " + source.val + " to target: " + target.val + " and path is: ");
                    printPath(graphNode, source,false);
                    System.out.println("\nTotal cost: " + graphNode.distance);
                }
            }
        }
    }

    private void printPath(WeightedGraphNode graphNode, WeightedGraphNode sourceNode, boolean isPathFound){
        if (graphNode.parent != null && !sourceNode.val.equals(graphNode.val)){
            isPathFound=true;
            printPath(graphNode.parent, sourceNode,isPathFound);
        }
        if (isPathFound){
            System.out.print(graphNode.val+" ");
        }
    }
}
