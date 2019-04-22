package homework_3_4;

public class BinarySearchTreeImpl<T extends Comparable> implements BinarySearchTree<T> {

    private Node root;

    @Override
    public void insert(T elem) {
        this.root = insert(this.root, new Node(elem));
    }

    private Node insert(Node root, Node node) {
        if (root == null) {
            root = node;
        } else {
            if (node.value.compareTo(root.value) < 0) {
                if (root.left == null) {
                    root.left = node;
                } else root.left = insert(root.left, node);
            } else {
                if (root.right == null) {
                    root.right = node;
                } else {
                    root.right = insert(root.right, node);
                }
            }
        }
        return root;
    }

    @Override
    public boolean remove(T elem) {
        return remove(root, elem);

    }

    private Node findMinForRemove(Node tree) {
        Node previous = tree;
        Node current = tree.right;
        if (current.left == null) {
            return current;
        } else {
            while (current.left != null) {
                previous = current;
                current = current.left;
            }
            previous.left = current.right;
            current.right = tree.right;
            current.left = tree.left;
        }
        return current;
    }

    private boolean remove(Node current, T elem) {
        Node previous = null;
        while (!current.value.equals(elem)) {
            previous = current;
            if (elem.compareTo(current.value) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
        if (current.left != null && current.right != null) {
            if (previous.left.value == elem) {
                previous.left = findMinForRemove(current);
                previous.left.left = current.left;
            } else {
                previous.right = findMinForRemove(current);
                previous.right.left = current.left;
            }
        } else if (current.left != null) {
            if (previous.left.value == elem) {
                previous.left = current.left;
            } else previous.right = current.left;
        } else if (current.right != null) {
            if (previous.left.value == elem) {
                previous.left = current.right;
            } else previous.right = current.right;
        } else {
            if (previous.left.value == elem) {
                previous.left = null;
            } else previous.right = null;
        }
        return true;
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
