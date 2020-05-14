package Finite_State_Machine_and_Testing;

import java.util.ArrayList;

public class Node {
    
    private ArrayList<Connection> connectedNodes = new ArrayList<Connection>();
    private String nodeName;
    private String returnString;

    public Node(String nodeName)
    {
        this.nodeName = nodeName;
        returnString = "The sequence ended at: " + nodeName;
    }

    public void setNode(Connection... connections)
    {
        for(Connection connection : connections)
        {
            connectedNodes.add(connection);
        }
    }

    public void setReturnString(String returnString)
    {
        this.returnString = returnString;
    }

    public void readSequence(String sequence)
    {
        double r = Math.random();
        double passedChance = 0;
        for(Connection connection : connectedNodes)
        {
            if (sequence.substring(0, 1).equals(connection.s) && r <= passedChance + connection.chance)
            {
                if (sequence.length() == 1)
                    System.out.println(connection.n.toString());
                else
                    connection.n.readSequence(sequence.substring(1));

                return;
            }
            passedChance += connection.chance;
        }
    }

    public String toString()
    {
        return returnString;
    }

    public ArrayList<Connection> getConnectedNotes()
    {
        return connectedNodes;
    }

}