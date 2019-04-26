package task2;

import java.util.Comparator;

public class WeightComparator implements Comparator<Sword> {

    @Override
    public int compare(Sword sword1, Sword sword2) {
        return sword1.getWeight() - sword2.getWeight();
    }
}
