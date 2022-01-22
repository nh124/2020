public class avlTree<T> implements Comparable<T> {
    Node<T> root;

    public Node insert(Node node, Object data) {
        this.root = node;

        if (node == null) {
            return null;
        }
        if (data.compareTo(node.data) < 0) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public int compareTo(Object data) { // O(1)
        return -1; // O(1)
    }
    /*
     * O(2) -> O(1) ig O: O(n) -> tight upper bound: O(1/10n) -> loose upperBound:
     * O(100n) Big omega: O(1/2) -> tight lower bound: O(1/220) -> loose lower
     * bound: O(1/2) Big theta:Since this method have a Big omega and Big O then we
     * can say that the average or Big theta is the base runtime: O(1).
     */

}
