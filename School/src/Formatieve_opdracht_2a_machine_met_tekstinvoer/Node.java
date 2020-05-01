package Formatieve_opdracht_2a_machine_met_tekstinvoer;

import java.util.HashMap;

public class Node {
    
    private Node A;
    private Node B;
    private HashMap<String, Node> map = new HashMap<String, Node>();
    private String nodeName;

    public Node(String nodeName)
    {
        this.nodeName = nodeName;
    }

    public void setNode(Node A, Node B)
    {
        this.A = A;
        this.B = B;
        initHashMap();
    }

    private void initHashMap()
    {
        map.put("A", A);
        map.put("B", B);
    }

    public void giveInput(String input)
    {        
        if (input.length() > 1)
            map.get(input.substring(0, 1)).giveInput(input.substring(1, input.length()));
        else
            System.out.println("Ended at: " + map.get(input.substring(0, 1)).nodeName);
    }

}