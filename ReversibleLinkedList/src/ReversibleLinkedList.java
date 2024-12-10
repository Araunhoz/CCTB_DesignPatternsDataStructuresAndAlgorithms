class ReversibleLinkedList<T> extends IterableLinkedList<T> {
    public ReversibleLinkedList() {
        super();
    }

    @Override
    public Node<T> add(T data) {
        return super.add(data);
    }

    public void reverse() {
        Node<T> current = head;
        Node<T> temp = null;

        tail = head;

        while (current != null) {
            temp = current.getPreviousNode();
            current.setPreviousNode(current.getNextNode());
            current.setNextNode(temp);
            current = current.getPreviousNode();
        }

        if (temp != null) {
            head = temp.getPreviousNode();
        }
    }
}
