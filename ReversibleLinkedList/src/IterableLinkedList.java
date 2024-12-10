import java.util.Iterator;

class IterableLinkedList<T> extends DoubleLinkedList<T> implements Iterable<T>, Iterator<T> {
    private Node<T> currentNode;

    public IterableLinkedList() {
        currentNode = getFirstNode();
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public T next() {
        T data = currentNode.getData();
        currentNode = currentNode.getNextNode();
        return data;
    }

    @Override
    public Iterator<T> iterator() {
        currentNode = getFirstNode();
        return this;
    }
}
