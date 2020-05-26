package Dijkstra_Shortest_Path_and_Datastructuren;

import java.util.ArrayList;
import java.util.List;

public class Reis extends Graph implements Comparable {

    private List<Stap> stappen = new ArrayList<>();

    public List<Stap> getStappen() {
        return stappen;
    }

    public void setStappen(List<Stap> stappen) {
        this.stappen = stappen;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
