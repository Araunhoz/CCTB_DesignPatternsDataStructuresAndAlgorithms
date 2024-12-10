class DoubleLinkedList<T> implements LinkedList<T> {
    protected Node<T> head;
    protected Node<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Node<T> add(T data) {
        Node<T> newNode = new DoubleNode<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode);
            newNode.setPreviousNode(tail);
            tail = newNode;
        }
        return newNode;
    }

    @Override
    public Node<T> getFirstNode() {
        return head;
    }

    public Node<T> getHead() {
        return head;
    }
}
