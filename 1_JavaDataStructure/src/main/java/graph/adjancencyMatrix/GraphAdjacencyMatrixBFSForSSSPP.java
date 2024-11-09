package graph.adjancencyMatrix;

import graph.node.GraphNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphAdjacencyMatrixBFSForSSSPP extends GraphAdjacencyMatrix{

    private boolean pathFound;
    public GraphAdjacencyMatrixBFSForSSSPP(List<GraphNode> graphNodeList) {
        super(graphNodeList);
        this.pathFound=false;
    }

    public static void main (String[] args){

        //Below is used to find the SSSPP using BFS
        List<GraphNode> node = new ArrayList<>();
        node.add(new GraphNode("A", 0));
        node.add(new GraphNode("B", 1));
        node.add(new GraphNode("C", 2));
        node.add(new GraphNode("D", 3));
        node.add(new GraphNode("E", 4));

        GraphAdjacencyMatrixBFSForSSSPP g = new GraphAdjacencyMatrixBFSForSSSPP(node);
        g.addUndirectedEdgesToAdjacencyMatrix(0, 1); // Adding Edges to A to B AND B to A
        g.addUndirectedEdgesToAdjacencyMatrix(0, 2); // Adding Edges to A to C AND C to A
        g.addUndirectedEdgesToAdjacencyMatrix(0, 3); // Adding Edge to A to D AND D to A
        g.addUndirectedEdgesToAdjacencyMatrix(1, 4); // Adding edges to B to E AND E to B
        g.addUndirectedEdgesToAdjacencyMatrix(2, 3); // Adding edges to C to D AND D to C
        g.addUndirectedEdgesToAdjacencyMatrix(3, 4); // Adding Edges to D to E AND E to D

        String source = "A";
        String target = "E";

        g.bfsForSSSPPP(source, target);

        if(!g.pathFound){
            System.out.println("No Path found between "+source+" to "+target);
        }
    }

    public void bfsForSSSPPP(String source, String target){
        graph.forEach(g -> {
            if(!g.isVisited()){
                bfsForSSSPPPVist(g, source,target);
            }
        });

    }

    private void bfsForSSSPPPVist(GraphNode g, String source, String target) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(g);
        while(!queue.isEmpty()){
            GraphNode node = queue.removeFirst();
            node.setVisited(true);
            List<GraphNode> neighbours = getNeighbors(node);
            neighbours.forEach(neighbour -> {
                if(!neighbour.isVisited()){
                    queue.add(neighbour);
                    neighbour.setVisited(true);
                    neighbour.setParentNode(node);
                }
            });
            if(node.getName().equals(target)){
                pathFound=true;
                System.out.println("Path from "+ source+ " to "+target);
                printPath(node,source);
            }
        }
    }

    private void printPath(GraphNode node,String source){

        if(node.getParentNode()!= null && !node.getName().equals(source)){
            System.out.print(node.getName() + " -> ");
            printPath(node.getParentNode(),source);
        }
        else {
            System.out.print(node.getName());
        }
    }
}
