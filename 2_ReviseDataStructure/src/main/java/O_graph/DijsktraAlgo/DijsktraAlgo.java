package O_graph.DijsktraAlgo;

import O_graph.node.WeightedGraphNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DijsktraAlgo {

    List<WeightedGraphNode> graph;

    public DijsktraAlgo(){
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

    public void dijsktraAlgo(String source, String target){
        var pathFound = false;
        PriorityQueue<WeightedGraphNode> queue = new PriorityQueue<>();
        graph.get(0).distance = 0;
        queue.addAll(graph);
        while (!queue.isEmpty()){
            var currentNode = queue.remove();
            var neighbours = currentNode.neighbours;
            for (WeightedGraphNode neighbour: neighbours){
                if (neighbour.distance > currentNode.distance+currentNode.weightGraph.get(neighbour)){
                    neighbour.distance = currentNode.distance+currentNode.weightGraph.get(neighbour);
                    neighbour.parent = currentNode;
                    queue.remove(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        for (WeightedGraphNode graphNode:graph){
            if (graphNode.val.equals(target)){
                System.out.print("Path from source: "+source+" to target: "+target+" with distance = "+graphNode.distance+" exists and path is: ");
                printPath(graphNode,source,pathFound);
            }
        }
    }

    private void printPath(WeightedGraphNode graphNode,String source,boolean pathFound){

        if (graphNode.parent != null && !graphNode.val.equals(source)){
            pathFound=true;
            printPath(graphNode.parent,source,pathFound);
        }
        if (pathFound){
            System.out.print(graphNode.val+" ");
        }

    }
}
