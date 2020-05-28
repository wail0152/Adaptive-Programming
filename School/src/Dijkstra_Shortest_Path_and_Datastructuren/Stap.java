package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.LinkedList;

public class Stap extends Node {

    private LinkedList<Node> linkedNodes = new LinkedList<>();
    private Reis reis;

    public Stap(String name)
    {
        super(name);
    }

    public Reis getReis()
    {
        return reis;
    }

    public void setReis(Reis reis)
    {
        this.reis = reis;
    }

    public LinkedList<Node> getLinkedNodes() {
        return linkedNodes;
    }

    public void setLinkedNodes(LinkedList<Node> linkedNodes) {
        this.linkedNodes = linkedNodes;
    }
}
