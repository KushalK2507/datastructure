package org.graph;

import org.graph.node.GraphNode;


public class AdjacencyListMain {

    public static void main(String[] args) {

        AdjacencyList graphAdjacencyList = new AdjacencyList();
        graphAdjacencyList.graph.add(new GraphNode("A",0));
        graphAdjacencyList.graph.add(new GraphNode("B",1));
        graphAdjacencyList.graph.add(new GraphNode("C",2));
        graphAdjacencyList.graph.add(new GraphNode("D",3));
        graphAdjacencyList.graph.add(new GraphNode("E",4));

        graphAdjacencyList.addUndirectedEdge(0,1);
        graphAdjacencyList.addUndirectedEdge(0,2);
        graphAdjacencyList.addUndirectedEdge(0,3);
        graphAdjacencyList.addUndirectedEdge(1,4);
        graphAdjacencyList.addUndirectedEdge(2,3);
        graphAdjacencyList.addUndirectedEdge(3,4);

        System.out.println("------Graph------ ");
        System.out.println(graphAdjacencyList);

        System.out.println("---------BFS--------");
        graphAdjacencyList.bfs();

        System.out.println("---------DFS--------");
        graphAdjacencyList.dfs();

        AdjacencyList graphAdjacencyListForTopoligcalSort = new AdjacencyList();
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("A",0));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("B",1));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("C",2));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("D",3));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("E",4));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("F",5));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("G",6));
        graphAdjacencyListForTopoligcalSort.graph.add(new GraphNode("H",7));

        graphAdjacencyListForTopoligcalSort.addDirectedEdge(0,2);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(1,2);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(1,3);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(2,4);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(3,5);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(4,7);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(4,5);
        graphAdjacencyListForTopoligcalSort.addDirectedEdge(5,6);

        System.out.println("------Topoligical Graph------ ");
        System.out.println(graphAdjacencyListForTopoligcalSort);

        System.out.println("----- Topological Sort--------");
        graphAdjacencyListForTopoligcalSort.topologicalSort();


    }
}
