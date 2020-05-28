package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class Main {

    private static PriorityQueue<Reis> reizen = new PriorityQueue<>();

    public static void main(String[] args)
    {
        String[] names1 = {"Utrecht", "Overijssel", "Flevo-Land", "Groningen"};
        Destination[] destinations1 = {new Destination(0, 1, 5), new Destination(0, 2, 5),
                                       new Destination(1, 3, 4), new Destination(2, 3, 5)};
        Reis reis1 = MakeReis(names1, destinations1, true, false, false);

        String[] names2 = {"Utrecht", "Zwolle", "Flevo-Land", "Groningen"};
        Destination[] destinations2 = {new Destination(0, 1, 4), new Destination(0, 2, 5),
                                       new Destination(1, 3, 4), new Destination(2, 3, 5)};
        Reis reis2 = MakeReis(names2, destinations2, true, false, false);

        reizen.add(reis1);
        reizen.add(reis2);

        for(Reis reis: reizen) {
            reis.printReis();
        }
    }

    private static Reis MakeReis(String[] names, Destination[] destinations, boolean rit, boolean treinrit, boolean vlucht)
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
