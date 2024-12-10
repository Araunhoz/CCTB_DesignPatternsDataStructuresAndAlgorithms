package Classroom2;

import java.util.Scanner;

public class GameUpdate {

    public static void main(String[] args) {

        int secret = 7;
        int guess;
        Scanner scanner = new Scanner(System.in);
        boolean temp = true;

        System.out.print("Please give me a number:");
        guess = scanner.nextInt();

        if (guess == secret)
            System.out.println("You win!");
        else
            System.out.println("You lost");
    }
}
