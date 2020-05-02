package Formatieve_opdracht_2b_Monte_Carlo_machine;

public class Dice {
    
    private int side;

    public Dice(int side)
    {
        this.side = side;
    }

    public String toString()
    {
        return "You threw a " + side;
    }

}