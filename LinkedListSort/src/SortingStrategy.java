interface SortingStrategy<T extends Comparable<T>> {
    LinkedList<T> sort(LinkedList<T> list);
}