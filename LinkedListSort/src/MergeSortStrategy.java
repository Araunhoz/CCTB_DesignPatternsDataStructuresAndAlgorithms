import java.util.ArrayList;
import java.util.List;

class MergeSortStrategy<T extends Comparable<T>> implements SortingStrategy<T> {

    @Override
    public LinkedList<T> sort(LinkedList<T> list) {
        if (list.isEmpty() || list.getFirstNode().getNextNode() == null) {
            return list;
        }

        List<T> elements = new ArrayList<>();
        Node<T> currentNode = list.getFirstNode();
        while (currentNode != null) {
            elements.add(currentNode.getData());
            currentNode = currentNode.getNextNode();
        }

        elements = mergeSort(elements);

        LinkedList<T> sortedList = new DoubleLinkedList<>();
        for (T element : elements) {
            sortedList.add(element);
        }

        return sortedList;
    }

    private List<T> mergeSort(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<T> left = mergeSort(list.subList(0, mid));
        List<T> right = mergeSort(list.subList(mid, list.size()));

        return merge(left, right);
    }

    private List<T> merge(List<T> left, List<T> right) {
        List<T> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i++));
        }

        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }
}