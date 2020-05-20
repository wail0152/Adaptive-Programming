package Formatieve_opdracht_3a_Collections_Framework;

public class Human<T extends Comparable<T>>{
    
    private int age;

    public Human(int age)
    {
        this.age = age;
    }

    public int compareTo(T other) 
    {
        return Integer.parseInt(toString()) - Integer.parseInt(other.toString());
    }

    @Override
    public String toString() 
    {
        return String.valueOf(age);
    }

}
