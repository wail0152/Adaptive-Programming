
package Formatieve_opdracht_3a_Collections_Framework;

import java.util.ArrayList;
import java.util.Random;

public class Assignment4 {

    public static void main(String[] args) 
    {
        ArrayList<Human> populationList = generatePeopleList(10);
        bubbleSortList(populationList);
        printArray(populationList);
    }

    private static ArrayList<Human> generatePeopleList(int listSize)
    {
        ArrayList<Human> resultList = new ArrayList<Human>();

        for (int i = 0; i < listSize; i++)
        {
            Random random = new Random();
            Human human = new Human(random.nextInt(99));
            resultList.add(human);
        }

        return resultList;
    }

    private static <T> void bubbleSortList(ArrayList<T> inputList)
    {
        int n = inputList.size();
        int newn = 0;
        while (n > 1)
        {
            newn = 0;
            for (int i = 1; i < n; i++)
            {             
                //if (inputList.get(i).compareTo(inputList.get(i - 1)) < 0)
                //{
                //    swap(inputList, i - 1, i);
                //    newn = i;
                //}
            }
            n = newn;
        }
    } 
    
    public static final <T> void swap (ArrayList<T> l, int a, int b) 
    {
        T t = l.get(a);
        l.set(a, l.get(b));
        l.set(b, t);
    }

    public static <T> void printArray(ArrayList<T> inputList) 
    {
        System.out.println();
        for (T element : inputList) 
        {
            //System.out.println(element.compareTo(element));
            System.out.printf("%s ", element.toString());
        }
     }

}