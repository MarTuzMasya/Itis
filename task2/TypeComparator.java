package task2;

import java.util.Comparator;

public class TypeComparator implements Comparator<Sword> {

    @Override
    public int compare(Sword sword1, Sword sword2) {
        return sword1.getType().compareTo(sword2.getType());
    }
}
