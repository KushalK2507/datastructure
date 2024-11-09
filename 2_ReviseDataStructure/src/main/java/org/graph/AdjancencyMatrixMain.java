package org.graph;

import org.graph.node.GraphNode;

public class AdjancencyMatrixMain {

    public static void main(String[] args) {

        AdjacencyMatrix graphMatrix = new AdjacencyMatrix(5);
        graphMatrix.graph.add(new GraphNode("A",0));
        graphMatrix.graph.add(new GraphNode("B",1));
        graphMatrix.graph.add(new GraphNode("C",2));
        graphMatrix.graph.add(new GraphNode("D",3));
        graphMatrix.graph.add(new GraphNode("E",4));

        graphMatrix.addUndirectedEdge(0,1);
        graphMatrix.addUndirectedEdge(0,2);
        graphMatrix.addUndirectedEdge(0,3);
        graphMatrix.addUndirectedEdge(1,4);
        graphMatrix.addUndirectedEdge(2,3);
        graphMatrix.addUndirectedEdge(3,4);

        System.out.println("---------Graph--------");
        System.out.println(graphMatrix);

        System.out.println("---------BFS--------");
        graphMatrix.bfs();

        System.out.println("---------DFS--------");
        graphMatrix.dfs();

        AdjacencyMatrix graphAdjacencyMatrixForTopoligcalSort = new AdjacencyMatrix(8);
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("A",0));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("B",1));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("C",2));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("D",3));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("E",4));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("F",5));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("G",6));
        graphAdjacencyMatrixForTopoligcalSort.graph.add(new GraphNode("H",7));

        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(0,2);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(1,2);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(1,3);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(2,4);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(3,5);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(4,7);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(4,5);
        graphAdjacencyMatrixForTopoligcalSort.addDirectedEdge(5,6);

        System.out.println("------Topoligical Graph------ ");
        System.out.println(graphAdjacencyMatrixForTopoligcalSort);

        System.out.println("----- Topological Sort--------");
        graphAdjacencyMatrixForTopoligcalSort.topologicalSort();
    }
}
