package O_graph.adjacencyList;

import O_graph.node.GraphNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class AdjacencyListGraph {
    public List<GraphNode> graph;

    public AdjacencyListGraph(){
        graph = new LinkedList<>();
    }

    public void addNode(String val, int index){
        GraphNode node= new GraphNode(val,index);
        graph.add(node);
    }

    public void addUndirectedEge(int sourceIndex, int targetIndex){
        var sourceNode = graph.stream().filter(graphNode -> graphNode.index==sourceIndex).findFirst().orElse(null);
        var targetNode = graph.stream().filter(graphNode -> graphNode.index==targetIndex).findFirst().orElse(null);
        if (sourceNode == null || targetNode == null){
            return;
        }
        sourceNode.neighbours.add(targetNode);
        targetNode.neighbours.add(sourceNode);
    }

    public void addDirectedEdges(int sourceIndex, int targetIndex){
        var sourceNode = graph.stream().filter(graphNode -> graphNode.index==sourceIndex).findFirst().orElse(null);
        var targetNode = graph.stream().filter(graphNode -> graphNode.index==targetIndex).findFirst().orElse(null);
        if (sourceNode == null || targetNode == null){
            return;
        }
        sourceNode.neighbours.add(targetNode);
    }
    public void bfs(){

        graph.forEach(graphNode -> {
            if (!graphNode.isVisited) {
                bfs(graphNode);
            }
        });

        graph.forEach(graphNode -> graphNode.isVisited=false);
    }

    public void dfs(){
        graph.forEach(graphNode -> {
            if (!graphNode.isVisited) {
                dfs(graphNode);
            }
        });
        graph.forEach(graphNode -> graphNode.isVisited=false);
    }

    public void topologicalSort(){
        Stack<GraphNode> stack = new Stack<>();
        graph.forEach(graphNode -> {
            if (!graphNode.isVisited){
                topologicalSort(graphNode,stack);
            }
        });

        while (!stack.isEmpty()){
            System.out.print(stack.pop().val+" ");
        }
        graph.forEach(graphNode -> graphNode.isVisited=false);
    }

    private void topologicalSort(GraphNode graphNode,Stack<GraphNode> result){


        var neighbours=graphNode.neighbours;
        for (GraphNode neighbour:neighbours){
            if (!neighbour.isVisited){
                topologicalSort(neighbour,result);
            }
        }
        graphNode.isVisited = true;
        result.push(graphNode);

    }

    private void dfs(GraphNode dfs){

        Stack<GraphNode> elements = new Stack<>();
        elements.push(dfs);
        while (!elements.isEmpty()){
            var currentNode = elements.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.val+" ");
            var neighbours = currentNode.neighbours;
            for (GraphNode neighbour:neighbours){
                if (!neighbour.isVisited){
                    elements.push(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }
    }

    private void bfs(GraphNode graphNode){

        Queue<GraphNode> elements = new LinkedList<>();
        elements.offer(graphNode);
        while (!elements.isEmpty()){
            var currentNode = elements.poll();
            currentNode.isVisited=true;
            System.out.print(currentNode.val+" ");
            var neighbours = currentNode.neighbours;
            for (GraphNode neighbour: neighbours){
                if (!neighbour.isVisited){
                    elements.offer(neighbour);
                    neighbour.isVisited=true;
                }
            }
        }
    }
}
