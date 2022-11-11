package PatikaStore;

import java.util.Comparator;

public class orderbybrand implements Comparator<brand> {
    @Override
    public int compare(brand o1, brand o2) {
        return o1.getMarkaİsmi().compareTo(o2.getMarkaİsmi());
    }
}
