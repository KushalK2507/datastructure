package org.graph;

import org.graph.node.GraphNode;

import javax.management.QueryEval;
import java.util.*;
import java.util.stream.Collectors;

public class AdjacencyList {

    List<GraphNode> graph;


    public AdjacencyList(){
        graph = new ArrayList<>();
    }

    public void addUndirectedEdge(int i, int j){
        var first = graph.get(i);
        var second = graph.get(j);
        first.getNeighbours().add(second);
        second.getNeighbours().add(first);
    }

    public void addDirectedEdge(int i, int j){
        graph.get(i).getNeighbours().add(graph.get(j));
    }

    private void bfs(GraphNode node){
        Queue<GraphNode> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            var currentNode = elements.poll();
            currentNode.setVisited(true);
            System.out.print(currentNode.getValue()+" ");
            var neighbours = currentNode.getNeighbours();
            for (GraphNode neighbour : neighbours){
                if (!neighbour.isVisited()) {
                    elements.offer(neighbour);
                    neighbour.setVisited(true);
                }
            }
        }
    }

    public void bfs() {
        graph.forEach(graphNode -> {
            if (!graphNode.isVisited()) {
                bfs(graphNode);
            }
        });
        graph.forEach(graph -> graph.setVisited(false));
        System.out.println();
    }

    public void dfs(){

        graph.forEach(graphNode -> {
            if (!graphNode.isVisited()){
                dfs(graphNode);
            }
        });

        graph.forEach(graphNode -> graphNode.setVisited(false));
        System.out.println();

    }

    private void dfs(GraphNode node){

        Stack<GraphNode> elements = new Stack<>();
        elements.push(node);
        while (!elements.isEmpty()){
            var currentNode = elements.pop();
            currentNode.setVisited(true);
            System.out.print(currentNode.getValue()+" ");
            var neighbours = currentNode.getNeighbours();
            for (GraphNode neighbour: neighbours) {
                if (!neighbour.isVisited()) {
                    neighbour.setVisited(true);
                    elements.push(neighbour);
                }
            }
        }
    }

    public void topologicalSort(){
        Stack<GraphNode> elements = new Stack<>();
        for (GraphNode node:graph){
            if (!node.isVisited()){
                topologicalSort(node,elements);
            }
        }

        while (!elements.isEmpty()){
            System.out.print(elements.pop().getValue()+" ");
        }
    }

    private void topologicalSort(GraphNode node, Stack<GraphNode> elements){

        for (GraphNode neighbour : node.getNeighbours()){
            if (!neighbour.isVisited()){
               topologicalSort(neighbour,elements);
            }
        }
        elements.push(node);
        node.setVisited(true);

    }

    public String toString(){

        return graph.stream().map(graphNode -> graphNode.getValue()+"->"+graphNode.getNeighbours().stream().map(GraphNode::getValue).collect(Collectors.joining(","))).collect(Collectors.joining("\n"));
    }
}
