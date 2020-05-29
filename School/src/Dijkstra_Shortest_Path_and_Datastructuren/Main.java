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
        Reis reis1 = Graph.MakeReis(names1, destinations1, true, false, false);

        String[] names2 = {"Utrecht", "Zwolle", "Flevo-Land", "Groningen"};
        Destination[] destinations2 = {new Destination(0, 1, 4), new Destination(0, 2, 5),
                                       new Destination(1, 3, 4), new Destination(2, 3, 5)};
        Reis reis2 = Graph.MakeReis(names2, destinations2, true, false, false);

        reizen.add(reis1);
        reizen.add(reis2);

        for (Reis reis : reizen)
        {
            reis.printReis();
        }
    }

}
