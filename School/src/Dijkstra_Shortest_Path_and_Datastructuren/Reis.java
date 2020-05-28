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

            Stap s = new Stap("");
            s.setLinkedNodes(linkedListNodes);
            stappen.add(s);
        }
    }

    public void printReis()
    {
        for (Stap s : stappen) {
            for (Node n : s.getLinkedNodes()) {
                System.out.println(n.getName());
            }
        }
        System.out.println("\n");
    }

    @Override
    public int compareTo(Reis r)
    {
        int totalOther = 0;
        for (Stap stap : r.stappen)
        {
            for (Node n : stap.getLinkedNodes())
            {
                if (n instanceof Rit) totalOther += ((Rit) n).getFuel();
                else if (n instanceof Treinrit) totalOther += ((Treinrit) n).getTravelDistance();
                else if (n instanceof Vlucht) totalOther += ((Vlucht) n).getCost();
            }
        }

        int totalOwn = 0;
        for (Stap stap : stappen)
        {
            for (Node n : stap.getLinkedNodes())
            {
                if (n instanceof Rit) totalOwn += ((Rit) n).getFuel();
                else if (n instanceof Treinrit) totalOwn += ((Treinrit) n).getTravelDistance();
                else if (n instanceof Vlucht) totalOwn += ((Vlucht) n).getCost();
            }
        }

        return totalOwn - totalOther;
    }

}
