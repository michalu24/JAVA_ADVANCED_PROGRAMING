package _4_Cwiczenie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameRSP gameRSP = new GameRSP();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chose:\n1)ROCK\n2)Scissors\n3)Paper");
        int choice = scanner.nextInt();


        GameChoice gameChoice1;
        switch (choice) {
            case 1->gameChoice1 = GameChoice.ROCK;
            case 2->gameChoice1 = GameChoice.SCISSORS;
            case 3-> gameChoice1 = GameChoice.PAPER;
        }

        Random random = new Random();
        int choice2 = random.nextInt(3);

        GameChoice gameChoice2;
        switch (choice2) {
            case 1 -> gameChoice2=GameChoice.ROCK;
            case 2 -> gameChoice2=GameChoice.SCISSORS;
            case 3 -> gameChoice2 = GameChoice.PAPER;
            default -> gameChoice2 = GameChoice.ROCK;
        }


    }
}
