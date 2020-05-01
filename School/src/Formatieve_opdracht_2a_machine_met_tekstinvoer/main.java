package Formatieve_opdracht_2a_machine_met_tekstinvoer;

public class main {

    public static void main(String[] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setNode(s2, s1);
        s1.setNode(s1, s2);
        s2.setNode(s2, s3);
        s3.setNode(s3, s0);

        s0.giveInput("BAAB");
    }
    
}