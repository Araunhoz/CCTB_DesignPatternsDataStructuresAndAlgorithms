public class Main {
    public static void main(String[] args) {
        var movieList = new IterableLinkedList<String>();
        movieList.add("Evil Dead Rise");
        movieList.add("Don't Look Away");
        movieList.add("Separation");
        movieList.add("A Nightmare on Elm Street");
        movieList.add("Afraid");
        movieList.add("No One Will Save You");
        movieList.add("The Watchers");
        movieList.add("Cuckoo");
        movieList.add("Imaginary");
        movieList.add("Pet Sematary: Bloodlines");

        System.out.println("Unsorted list:");
        movieList.printList();
        System.out.println("\n");

        SortingStrategy<String> mergeSortStrategy = new MergeSortStrategy<>();
        LinkedList<String> sortedList = movieList.sort(mergeSortStrategy);

        System.out.println("Sorted list:");
        ((DoubleLinkedList<String>) sortedList).printList();
    }
}
