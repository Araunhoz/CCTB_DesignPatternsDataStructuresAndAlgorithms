import java.util.LinkedList;
import java.util.List;

class NumberList extends Subject<List<Integer>> {
    private List<Integer> numbers = new LinkedList<>();

    public void addNumber(int number) {
        numbers.add(number);
        notifyAllObservers(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
