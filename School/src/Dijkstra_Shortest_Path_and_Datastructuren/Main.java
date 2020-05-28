package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.List;
import java.util.PriorityQueue;

public class Main {

    private PriorityQueue<Reis> reizen = new PriorityQueue<>();

    public static void main(String[] args)
    {
        Reis reis1 = TestReis1();
        for (Stap s : reis1.getStappen())
        {
            for (Node n : s.getLinkedNodes()) {
                System.out.println(n.getName());
            }
        }
        //Reis reis2 = TestReis2();
        //System.out.println(reis1.compareTo(reis2));
    }

    private static Reis TestReis1()
    {
        Node nodeA = new Rit("Utrecht");
        Node nodeB = new Rit("Overijssel");
        Node nodeC = new Rit("Flevo-Land");
        Node nodeD = new Rit("Groningen");

        nodeA.addDestination(nodeB, 5);
        nodeA.addDestination(nodeC, 5);

        nodeB.addDestination(nodeD, 4);

        nodeC.addDestination(nodeD, 5);

        Reis reis = new Reis();

        reis.addNode(nodeA);
        reis.addNode(nodeB);
        reis.addNode(nodeC);
        reis.addNode(nodeD);

        reis = Dijkstra.calculateShortestPathFromSource(reis, nodeA);
        reis.setStappen(nodeD.getShortestPathToSelf());

        return reis;
    }

    private static Reis TestReis2()
    {
        Node nodeA = new Rit("Utrecht");
        Node nodeB = new Rit("Zwolle");
        Node nodeC = new Rit("Flevo-Land");
        Node nodeD = new Rit("Groningen");

        nodeA.addDestination(nodeB, 5);
        nodeA.addDestination(nodeC, 5);

        nodeB.addDestination(nodeD, 3);

        nodeC.addDestination(nodeD, 5);

        Reis reis = new Reis();

        reis.addNode(nodeA);
        reis.addNode(nodeB);
        reis.addNode(nodeC);
        reis.addNode(nodeD);

        reis = Dijkstra.calculateShortestPathFromSource(reis, nodeA);
        for (Node ns : nodeD.getShortestPath())
        {
            System.out.println(ns.getName());
        }
        System.out.println(nodeD.getName());

        return reis;
    }

}
