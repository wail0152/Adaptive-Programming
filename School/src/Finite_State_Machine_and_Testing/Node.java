package Finite_State_Machine_and_Testing;

import java.util.ArrayList;

public class Node {
    
    private ArrayList<Connection> connectedNodes = new ArrayList<Connection>();
    private String nodeName;

    public Node(String nodeName)
    {
        this.nodeName = nodeName;
    }

    public void setNode(Connection... connections)
    {
        for(Connection connection : connections)
        {
            connectedNodes.add(connection);
        }
    }

    public void readSequence(String sequence)
    {
        if (sequence.length() == 1)
        {
            System.out.println("The sequence stopped at: " + nodeName);
            return;
        }

        double r = Math.random();
        double passedChance = 0;
        for(Connection connection : connectedNodes)
        {
            if (sequence.substring(0, 1).equals(connection.s) && r <= passedChance + connection.chance)
            {
                connection.n.readSequence(sequence.substring(1, sequence.length()));
                return;
            }
            passedChance += connection.chance;
        }
    }

    public String toString()
    {
        return "The sequence ended at: " + nodeName;
    }

}