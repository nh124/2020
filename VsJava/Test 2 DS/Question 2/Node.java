public class Node<T> {
    Node<T> right;
    Node<T> left;
    Node<T> next;
    T data;

    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
        next = null;
    }

}
