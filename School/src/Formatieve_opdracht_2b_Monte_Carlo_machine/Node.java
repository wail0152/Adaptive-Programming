package Formatieve_opdracht_2b_Monte_Carlo_machine;

public class Node {
    
    private Object a;
    private Object b;
    private double aChance;
    private double bChance;

    public void setConnection(Object a, double aChance, Object b, double bChance)
    {
        this.a = a;
        this.b = b;
        this.aChance = aChance;
        this.bChance = bChance;
    }

    public void goToNext()
    {
        double chance = Math.random();
        Object next = (chance <= aChance) ? a : b;

        if (next.getClass() == Node.class)
            ((Node) next).goToNext();
        else
            System.out.println(((Dice) next).toString());
    }

}