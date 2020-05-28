package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reis extends Graph implements Comparable<Reis> {

    private List<Stap> stappen = new ArrayList<>();

    public List<Stap> getStappen()
    {
        return stappen;
    }

    public void setStappen(LinkedList<Node> nodes)
    {
        for (int i = 0; i < nodes.size() - 1; i++)
        {
            LinkedList<Node> linkedListNodes = new LinkedList<>();
            linkedListNodes.add(nodes.get(i));
            linkedListNodes.add(nodes.get(i + 1));

            Stap s = new Stap("A");
            s.setLinkedNodes(linkedListNodes);
            stappen.add(s);
        }
    }

    @Override
    public int compareTo(Reis r)
    {
        int totalOther = 0;
        for (Stap stap : r.stappen)
        {
            if (stap instanceof Rit)
            {
                totalOther += ((Rit) stap).fuel;
            }
        }

        int totalOwn = 0;
        for (Stap stap : stappen)
        {
            if (stap instanceof Rit)
            {
                totalOwn += ((Rit) stap).fuel;
            }
        }

        return totalOwn - totalOther;
    }

}
