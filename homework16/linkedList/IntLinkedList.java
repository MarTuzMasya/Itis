package homework16.linkedList;

public class IntLinkedList implements IntList {
    private Node first;
    private int n = 0;

    @Override
    public void add(int elem) {
        Node newNode = new Node();
        newNode.value = elem;

        if (first != null) {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
            first = newNode;
        }
        n++;
    }

    @Override
    public void add(int elem, int position) {

    }

    @Override
    public int get(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= n) {
            throw new IndexOutOfBoundsException("No such element with index = " + index);
        }
        int i = 0;
        Node current = first;
        while (i < index - 1) {
            current = current.next;
            i++;
        }
        if (index != 0) {
            current = current.next.next;
        } else {
            first = current.next;
        }
        n--;
    }


    @Override
    public int size() {
        return n;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void sort() {

    }

    @Override
    public void addAll(IntList list, int position) {

    }

    @Override
    public int lastIndexOf(int elem) {
        return 0;
    }

    @Override
    public IntIterator iterator() {
        return new IntIteratorImpl();
    }

    class IntIteratorImpl implements IntIterator {
        Node current;

        public IntIteratorImpl() {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public int next() {
            int valueToReturn = current.value;
            current = current.next;
            return valueToReturn;
        }
    }

}
