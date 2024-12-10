import java.util.List;

class ListObserver extends Observer<List<Integer>> {
    @Override
    public void update(List<Integer> change) {
        int smallest = change.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
        int largest = change.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println("Smallest number: " + smallest + ", Largest number: " + largest);
    }
}
