package task2;

import java.util.Comparator;

public class LengthComparator implements Comparator<Sword> {

    @Override
    public int compare(Sword sword1, Sword sword2) {
        return sword1.getLength() - sword2.getLength();
    }
}
