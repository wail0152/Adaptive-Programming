package Dijkstra_Shortest_Path_and_Datastructuren;

public class Rit extends Stap {

    public Double fuel;

    public Rit(String name)
    {
        super(name);
    }

    public Double getFuel()
    {
        fuel = getDistance() * 10.1;
        return fuel;
    }

}
