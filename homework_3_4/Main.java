package homework_3_4;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTreeImpl<>();
        bst.insert(17);
        bst.insert(26);
        bst.insert(10);
        bst.insert(30);
        bst.insert(125);
        bst.insert(124);
        bst.insert(192);
        bst.insert(642);
        bst.insert(34);
        bst.remove(124);
        bst.remove(10);
        bst.printAllByLevels();




    }
}

