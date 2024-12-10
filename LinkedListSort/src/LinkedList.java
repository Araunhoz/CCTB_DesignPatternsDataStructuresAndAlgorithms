interface LinkedList<T extends Comparable<T>> {
    boolean isEmpty();
    Node<T> add(T data);
    Node<T> getFirstNode();
}
