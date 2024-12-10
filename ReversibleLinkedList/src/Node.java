interface Node<T> {
    T getData();
    void setData(T data);
    Node<T> getNextNode();
    void setNextNode(Node<T> node);
    Node<T> getPreviousNode();
    void setPreviousNode(Node<T> node);
}