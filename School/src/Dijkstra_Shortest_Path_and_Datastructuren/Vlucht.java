package Dijkstra_Shortest_Path_and_Datastructuren;

public class Vlucht extends Stap {

    public Double cost;

    public Vlucht(String name) {
        super(name);
    }

    public Double getCost()
    {
        cost = getDistance() * 52.4;
        return cost;
    }
}
