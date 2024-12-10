
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> gamesList = new DoubleLinkedList<>();
        gamesList.add("Resident Evil: Code Veronica");
        gamesList.add("Outlast");
        gamesList.add("The Forest");
        gamesList.add("World of Warcraft");
        gamesList.add("Diablo 4");
        gamesList.add("Elden Ring");

        System.out.println("Amazing games List:");
        gamesList.printList();
    }
}
