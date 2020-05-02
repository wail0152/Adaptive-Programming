package Finite_State_Machine_and_Testing;

public class Main {
 
    public static void main(String[] args) 
    {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setNode(new Connection(s1, 0.5, "A"), new Connection(s2, 0.3, "B"), new Connection(s3, 0.2, "B"));
        s1.setNode(new Connection(s1, 0.5, "B"), new Connection(s0, 0.5, "A"));
        s2.setNode(new Connection(s2, 0.5, "B"), new Connection(s2, 0.5, "A"));
        s3.setNode(new Connection(s1, 0.5, "A"), new Connection(s0, 0.5, "A"));

        s0.readSequence("BAAB");
    }

}