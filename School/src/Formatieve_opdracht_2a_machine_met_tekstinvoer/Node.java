package Formatieve_opdracht_2a_machine_met_tekstinvoer;

public class Node {
    
    private Node A;
    private Node B;

    public void setNode(Node A, Node B)
    {
        this.A = A;
        this.B = B;
    }

    public void giveInput(String input)
    {
        System.out.println(input.substring(0, 1));
        switch(input.substring(0, 1))
        {
            case "A":
                A.giveInput(input.substring(1, -1));
                break;

            case "B":
                B.giveInput(input.substring(1, -1));
                break;
        } 
    }

}