package Finite_State_Machine_and_Testing;

public class Connection {
  
    public Node n;
    public double chance;
    public String s;

    public Connection(Node n, double chance, String s)
    {
        this.n = n;
        this.chance = chance;
        this.s = s;
    }

}