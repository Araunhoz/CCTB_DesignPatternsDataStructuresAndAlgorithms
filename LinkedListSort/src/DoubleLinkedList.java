class DoubleLinkedList<T extends Comparable<T>> implements LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

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

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNextNode();
        }
    }

    public LinkedList<T> sort(SortingStrategy<T> strategy) {
        return strategy.sort(this);
    }
}