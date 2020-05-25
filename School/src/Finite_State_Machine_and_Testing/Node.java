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

    public String readSequence(String sequence)
    {
        double r = Math.random();
        double passedChance = 0;
        for(Connection connection : connectedNodes)
        {
            if (sequence.substring(0, 1).equals(connection.s) && r <= passedChance + connection.chance)
            {
                if (connection.n == null)
                    return toString() + " with an error for the input " + sequence.charAt(0);
                else if (sequence.length() == 1)
                    return connection.n.toString();
                else
                    return connection.n.readSequence(sequence.substring(1));
            }
            passedChance += connection.chance;
        }
        return "The sequence ended at: " + nodeName + " with no path for the input " + sequence.charAt(0);
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