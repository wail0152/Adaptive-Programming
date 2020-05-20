package Formatieve_opdracht_3a_Collections_Framework;

import java.util.ArrayList;
import java.util.Random;

public class Assignment1 {

    public static void main(String[] args) 
    {
        ArrayList<Character> alphabetList = generateCharList(10);
        bubbleSortList(alphabetList);
        for (Character c : alphabetList)
        {
            System.out.println(c);
        }
    }

    private static ArrayList<Character> generateCharList(int listSize)
    {
        ArrayList<Character> resultList = new ArrayList<Character>();

        for (int i = 0; i < listSize; i++)
        {
            Random random = new Random();
            char randomChar = (char)(random.nextInt(26) + 'a');
            resultList.add(randomChar);
        }

        return resultList;
    }

    private static void bubbleSortList(ArrayList<Character> givenList)
    {
        int n = givenList.size();
        int newn = 0;
        while (n > 1)
        {
            newn = 0;
            for (int i = 1; i < n; i++)
            {
                if (givenList.get(i - 1) > givenList.get(i))
                {
                    swap(givenList, i - 1, i);
                    newn = i;
                }
            }
            n = newn;
        }
    } 
    
    public static final <T> void swap (ArrayList<T> l, int a, int b) {
        T t = l.get(a);
        l.set(a, l.get(b));
        l.set(b, t);
      }

}