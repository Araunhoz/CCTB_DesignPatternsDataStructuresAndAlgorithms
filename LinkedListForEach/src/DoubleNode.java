class DoubleNode<T> implements Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> previous;

    public DoubleNode(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public Node<T> getNextNode() {
        return next;
    }

    @Override
    public void setNextNode(Node<T> node) {
        this.next = node;
    }

    @Override
    public Node<T> getPreviousNode(){
        return previous;
    }

    @Override
    public void setPreviousNode(Node<T> node) {
        this.previous = node;
    }





}
