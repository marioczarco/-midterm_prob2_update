package assignment1_411.multi_num_clicker_update;

import java.util.ArrayList;

/**
 * Created by Zarco on 11/3/2019.
 */

public class counterKeeper {
    //ourInstance keeps track of the list
    private static final counterKeeper ourInstance = new counterKeeper();
    //Make an array to hold the list elements
    private ArrayList<Counter> multipleCounters;

    static public counterKeeper getInstance() {
        return ourInstance;
    }

    private counterKeeper() {
        createCounterObjects();
    }

    public ArrayList<Counter> getCounterList() {
        return multipleCounters;
    }

    public void setCounterList(ArrayList<Counter> counterList) {
        multipleCounters = counterList;
    }

    protected void createCounterObjects() {
        Counter newCounter = new Counter(0);
        multipleCounters = new ArrayList<>();
        multipleCounters.add(newCounter);
        Counter newCounter2 = new Counter(0);
        multipleCounters.add(newCounter2);
        Counter newCounter3 = new Counter(0);
        multipleCounters.add(newCounter3);
    }
}
