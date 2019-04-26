package task2;

import java.util.ArrayList;
import java.util.Comparator;

public class SwordList {
    private ArrayList<Sword> swords = new ArrayList<>();

    public void add(Sword sword) {
        swords.add(sword);
    }

    public Sword[] topN(Comparator<Sword> comparator, int n) {
        Sword[] swordsTop = new Sword[n];
        swords.sort(comparator);
        for (int i = 0; i < n; i++) {
            swordsTop[i] = swords.get(i);
        }
        return swordsTop;
    }

}

