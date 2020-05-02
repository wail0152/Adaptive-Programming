package Formatieve_opdracht_2b_Monte_Carlo_machine;

public class Main {
    
    public static void main(String[] args) 
    {
        Node n0 = new Node();  
        Node n1 = new Node();  
        Node n2 = new Node();    
        Node n3 = new Node();    
        Node n4 = new Node();    
        Node n5 = new Node();    
        Node n6 = new Node(); 
        
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(2);
        Dice d3 = new Dice(3);
        Dice d4 = new Dice(4);
        Dice d5 = new Dice(5);
        Dice d6 = new Dice(6);

        n0.setConnection(n1, 0.5, n2, 0.5);
        n1.setConnection(n3, 0.5, n4, 0.5);
        n2.setConnection(n5, 0.5, n6, 0.5);
        n3.setConnection(n1, 0.5, d1, 0.5);
        n4.setConnection(d2, 0.5, d3, 0.5);
        n5.setConnection(d4, 0.5, d5, 0.5);
        n6.setConnection(n2, 0.5, d6, 0.5);

        n0.goToNext();
    }

}