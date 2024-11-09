package org.graph;

import org.graph.node.GraphNode;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class AdjacencyMatrix {

    List<GraphNode> graph;

    int[][] matrix;

    public AdjacencyMatrix(int noOfNodes){
        graph = new ArrayList<>();
        matrix = new int[noOfNodes][noOfNodes];
    }

    public void addUndirectedEdge(int i, int j){
        matrix[i][j] =1;
        matrix[j][i] =1;
    }

    public void addDirectedEdge(int i, int j){
        matrix[i][j]=1;
    }

    public List<GraphNode> getNeighbour(GraphNode node){
        var index = node.getIndex();
        List<GraphNode> neighbours = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            if (matrix[index][i]==1){
                neighbours.add(graph.get(i));
            }
        }
        return neighbours;
    }

    public void bfs(){
        graph.forEach(graphNode -> {
            if (!graphNode.isVisited()) {
                bfs(graphNode);
            }
        });

        graph.forEach(graphNode -> graphNode.setVisited(false));
        System.out.println();
    }

    private void bfs(GraphNode node){

        Queue<GraphNode> elements = new LinkedList<>();
        elements.add(node);
        while (!elements.isEmpty()){
            var currentNode = elements.poll();
            currentNode.setVisited(true);
            System.out.print(currentNode.getValue()+" ");
            var neighbours = getNeighbour(currentNode);
            for (GraphNode neighbour: neighbours){
                if (!neighbour.isVisited()){
                    neighbour.setVisited(true);
                    elements.offer(neighbour);
                }
            }
        }
    }

    public void dfs(){
        graph.forEach(graphNode -> {
            if (!graphNode.isVisited()) {
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
            var neighbours = getNeighbour(currentNode);
            for (GraphNode neighbour: neighbours){
                if (!neighbour.isVisited()){
                    neighbour.setVisited(true);
                    elements.push(neighbour);
                }
            }
        }
    }

    public void topologicalSort(){
        Stack<GraphNode> elements = new Stack<>();
        for (GraphNode graphNode:graph){
            if (!graphNode.isVisited()){
                topologicalSort(graphNode,elements);
            }
        }

        while (!elements.isEmpty()){
            System.out.print(elements.pop().getValue()+" ");
        }
    }

    private void topologicalSort(GraphNode node, Stack<GraphNode> elements){

        for (GraphNode neighbour : getNeighbour(node)){
            if (!neighbour.isVisited()){
               topologicalSort(neighbour,elements);
            }
        }
        node.setVisited(true);
        elements.push(node);
    }


    public String toString(){
        var resultBuilder = new StringBuilder();
        resultBuilder.append("\t");
        resultBuilder.append(graph.stream().map(GraphNode::getValue).collect(Collectors.joining("  ")));
        resultBuilder.append("\n");
        for (int i=0;i< matrix.length;i++){
            resultBuilder.append(graph.get(i).getValue()).append("  ").append(Arrays.toString(matrix[i])).append("\n");
        }
        return resultBuilder.toString();
    }
}
