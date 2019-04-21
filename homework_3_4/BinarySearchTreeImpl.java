package homework_3_4;

public class BinarySearchTreeImpl<T extends Comparable> implements BinarySearchTree<T> {

    private Node root;

    @Override
    public void insert(T elem) {
        this.root = insert(this.root, elem);
    }

    private Node insert(Node root, T elem) {
        if (root == null) {
            root = new Node(elem);
        } else {
            if (root.value.compareTo(elem) >= 0) {
                root.left = insert(root.left, elem);
            } else {
                root.right = insert(root.right, elem);
            }
        }
        return root;
    }

    @Override
    public boolean remove(T elem) {
        return remove(root, null, elem);

    }

    private boolean remove(Node current, Node previous, T elem) {

        if (current == null) {
            return false;
        } else {
            if (elem.compareTo(current.value) < 0) {

                return remove(current.left, current, elem);
            } else if (elem.compareTo(current.value) > 0) {
                return remove(current.right, current, elem);
            } else {
                if (current.left == null && current.right == null) {
                    if (previous.left == current) {
                        previous.left = null;
                    } else {
                        previous.right = null;
                    }

                } else {
                    Node node;
                    node = current.right;
                    if (previous == null) {
                        root = current.left;
                        current = root;
                    } else
                    if (previous.left == current) {

                        previous.left = previous.left.left;
                        current = previous.left;
                    } else {
                        previous.right = previous.right.left;
                        current = previous.right;
                    }
                    while (current.right != null) {
                        current = current.right;
                    }
                    current.right = node;

                }
                return true;


            }
        }
    }



    @Override
    public boolean contains(T elem) {
        return contains(this.root, elem);
    }

    private boolean contains(Node current, T elem) {
        if (current == null) {
            return false;
        } else {
            if (elem.compareTo(current.value) < 0) {
                return contains(current.left, elem);
            } else if (elem.compareTo(current.value) > 0) {
                return contains(current.right, elem);
            } else {
                return true;
            }
        }

    }


    @Override
    public void printAll() {
        printAll(this.root);
    }

    private void printAll(Node root) {
        if (root != null) {
            printAll(root.left);
            System.out.println(root.value);
            printAll(root.right);
        }
    }

    @Override
    public void printAllByLevels() {
        printAllByLevels(root);
    }

    private void printAllByLevels(Node root) {
        if (root != null) {
            printAllByLevels(root.left);
            printAllByLevels(root.right);
            System.out.println(root.value);
        }
    }

    private class Node {
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
