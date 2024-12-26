package J_Graph.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedGraphNode implements Comparable<WeightedGraphNode> {
    public String val;
    public int index;
    public int distance;
    public List<WeightedGraphNode> neighbours;
    public WeightedGraphNode parent;
    public Map<WeightedGraphNode,Integer> weightGraph;

    public WeightedGraphNode(String val, int index){
        this.val = val;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
        neighbours = new ArrayList<>();
        weightGraph = new HashMap<>();
    }

    @Override
    public int compareTo(WeightedGraphNode o) {
        return this.distance - o.distance;
    }
}
