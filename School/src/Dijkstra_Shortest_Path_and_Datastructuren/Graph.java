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

    public static Reis MakeReis(String[] names, Destination[] destinations, boolean rit, boolean treinrit, boolean vlucht)
    {
        List<Node> nodes = new ArrayList<>();
        for (String name : names)
        {
            Stap n = null;
            if (rit) n = new Rit(name);
            else if (treinrit) n = new Treinrit(name);
            else if (vlucht) n = new Vlucht(name);
            nodes.add(n);
        }

        for (int i = 0; i < destinations.length; i++)
        {
            nodes.get(destinations[i].sourceNode).addDestination(nodes.get(destinations[i].destinationNode), destinations[i].distance);
        }

        Reis reis = new Reis();
        reis.setNodes(nodes);

        reis = Dijkstra.calculateShortestPathFromSource(reis, nodes.get(0));
        reis.setStappen(nodes.get(nodes.size() - 1).getShortestPathToSelf());

        return reis;
    }

}
