package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.*;

public class Graph {

    private List<Node> nodes = new ArrayList<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

}
