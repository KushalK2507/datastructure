package graph.node;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WeightedGraphNode implements Comparable<WeightedGraphNode> {

    private String name;
    private int index;
    private int distance;
    private ArrayList<WeightedGraphNode> neighbours;
    private boolean isVisited;
    private WeightedGraphNode parent;
    private Map<WeightedGraphNode, Integer> weightedMap;

    public WeightedGraphNode(String name, int index){
        this.name = name;
        this.index = index;
        distance = Integer.MAX_VALUE;
        neighbours = new ArrayList<>();
        isVisited = false;
        parent = null;
        weightedMap = new HashMap<>();
    }

    @Override
    public int compareTo(WeightedGraphNode node) {
        return this.distance - node.distance;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public ArrayList<WeightedGraphNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<WeightedGraphNode> neighbours) {
        this.neighbours = neighbours;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public WeightedGraphNode getParent() {
        return parent;
    }

    public void setParent(WeightedGraphNode parent) {
        this.parent = parent;
    }

    public Map<WeightedGraphNode, Integer> getWeightedMap() {
        return weightedMap;
    }

    public void setWeightedMap(Map<WeightedGraphNode, Integer> weightedMap) {
        this.weightedMap = weightedMap;
    }




}
