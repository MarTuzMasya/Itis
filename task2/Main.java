package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SwordList swordList = new SwordList();

        swordList.add(new Sword(180, 5000, "sword"));
        swordList.add(new Sword(200, 4500, "rapier"));
        swordList.add(new Sword(160, 5000, "sword"));
        swordList.add(new Sword(100, 3000, "blade"));
        swordList.add(new Sword(210, 5200, "rapier"));
        swordList.add(new Sword(200, 5000, "rapier"));
        swordList.add(new Sword(160, 5300, "blade"));
        swordList.add(new Sword(190, 5000, "rapier"));
        swordList.add(new Sword(185, 4600, "rapier"));
        swordList.add(new Sword(180, 5000, "sword"));


        TypeComparator typeComparator = new TypeComparator();
        WeightComparator weightComparator = new WeightComparator();
        LengthComparator lengthComparator = new LengthComparator();

        int n = 3;

        System.out.println(Arrays.toString(swordList.topN(typeComparator, n)));
        System.out.println(Arrays.toString(swordList.topN(weightComparator, n)));
        System.out.println(Arrays.toString(swordList.topN(lengthComparator, n)));
    }
}
