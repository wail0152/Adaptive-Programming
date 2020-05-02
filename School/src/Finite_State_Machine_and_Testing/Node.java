package Finite_State_Machine_and_Testing;

import java.util.ArrayList;

public class Node {
    
    private ArrayList<Node> connectedNodes = new ArrayList<Node>();
    private ArrayList<Double> chances = new ArrayList<Double>();
    private String nodeName;

    public Node(String nodeName)
    {
        this.nodeName = nodeName;
    }

    public void setNode(Connection... connections)
    {
        for(Connection connection : connections)
        {
            connectedNodes.add(connection.n);
            chances.add(connection.chance);
        }
    }

    public String toString()
    {
        return "The sequence ended at: " + nodeName;
    }

}