package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.PriorityQueue;

public class Main {

    private PriorityQueue<Reis> reizen = new PriorityQueue<>();

    public static void main(String[] args)
    {
        TestReis();
        //Example();
    }

    private static void TestReis()
    {
        Node nodeA = new Node("Utrecht");
        Node nodeB = new Node("Overijssel");
        Node nodeC = new Node("Flevo-Land");
        Node nodeD = new Node("Groningen");

        nodeA.addDestination(nodeB, 5);
        nodeA.addDestination(nodeC, 5);

        nodeB.addDestination(nodeD, 4);

        nodeC.addDestination(nodeD, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
        for (Node ns : nodeD.getShortestPath())
        {
            System.out.println(ns.getName());
        }
        System.out.println(nodeD.getName());
    }

    private static void Example()
    {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
        for (Node ns : nodeE.getShortestPath())
        {
            System.out.println(ns.getName());
        }
    }

}
