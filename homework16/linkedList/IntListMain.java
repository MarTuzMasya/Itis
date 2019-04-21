package homework16.linkedList;

public class IntListMain {
    public static void main(String[] args) {

        IntList list = new IntLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(11);
        IntIterator iter = list.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.println(sum);
    }
}
