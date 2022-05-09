package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        var choice = Cli.getGame();
        System.out.println();

        String name;
        switch (choice) {
            case "1" -> Greet.greetings();
            case "2" -> {
                name = Greet.greetings();
                Engine.playGame(new Even(), name);
            }
            case "3" -> {
                name = Greet.greetings();
                Engine.playGame(new Calc(), name);
            }
            case "4" -> {
                name = Greet.greetings();
                Engine.playGame(new GCD(), name);
            }
            case "5" -> {
                name = Greet.greetings();
                Engine.playGame(new Progression(), name);
            }
            case "6" -> {
                name = Greet.greetings();
                Engine.playGame(new Prime(), name);
            }
            default -> {
            }
        }
    }
}
