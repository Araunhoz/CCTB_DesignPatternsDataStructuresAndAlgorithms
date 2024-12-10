public class Main {
    public static void main(String[] args) {
        var list = new ReversibleLinkedList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list.reverse();
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        list.add("Four");
        list.reverse();
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
