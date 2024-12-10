import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        ListObserver listObserver = new ListObserver();

        numberList.subscribe(listObserver);

        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numberList.addNumber(randomNumber);
            System.out.println("Added number: " + randomNumber);
        }
    }
}
