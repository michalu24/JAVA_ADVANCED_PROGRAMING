package _4_Cwiczenie;

import static _4_Cwiczenie.GameChoice.*;

public class GameRSP {

    public GameRSP() {
    }

    public void resultPlayerPaper(GameChoice gameChoice) {
        switch (gameChoice) {
            case ROCK -> System.out.println("WIN");
            case PAPER -> System.out.println("TIE");
            case SCISSORS -> System.out.println("LOSE");

        }
    }
    public void resultPlayerRock(GameChoice gameChoice) {
        switch (gameChoice) {
            case ROCK -> System.out.println("TIE");
            case PAPER -> System.out.println("LOSE");
            case SCISSORS -> System.out.println("WIN");

        }
    }
    public void resultPlayerScissors(GameChoice gameChoice) {
        switch (gameChoice) {
            case ROCK -> System.out.println("LOSE");
            case PAPER -> System.out.println("WIN");
            case SCISSORS -> System.out.println("TIE");

        }
    }

}
