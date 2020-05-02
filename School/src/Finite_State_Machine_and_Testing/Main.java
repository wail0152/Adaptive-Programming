package Finite_State_Machine_and_Testing;

public class Main {
 
    public static void main(String[] args) 
    {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setNode(new Connection(s1, 0.5), new Connection(s2, 0.3), new Connection(s3, 0.2));
        s1.setNode(new Connection(s1, 0.5), new Connection(s0, 0.5));
        s2.setNode(new Connection(s2, 0.5), new Connection(s2, 0.5));
        s3.setNode(new Connection(s1, 0.5), new Connection(s0, 0.5));

        //s0.giveInput("BAAB");
    }

}