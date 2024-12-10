public class Main {
    public static void main(String[] args) {

        var movieList = new IterableLinkedList<String>();

        movieList.add("The Conjuring");
        movieList.add("Halloween");
        movieList.add("Evil Dead Rise");
        movieList.add("MidSommar");
        movieList.add("The Exorcist");

        System.out.println("Best Movies:");
        for (String m : movieList) {
            System.out.println(m);
        }
    }
}

