package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    public static void playGame(Game game, String name) {

        System.out.println(game.getDescription());
        boolean isSuccess = true;
        final var iterations = 3;
        for (var i = 0; i < iterations; i++) {
            var questionAnswer = game.getQuestionAndResult();

            System.out.println("Question: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            var answer = sc.nextLine();

            boolean isRight = (answer.equals(questionAnswer[1]));

            if (isRight) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionAnswer[1]);
                System.out.println("Let's try again, " + name + "!");
                isSuccess = false;
                break;
            }
        }
        if (isSuccess) {
            System.out.println("Congratulations " + name + "!");
        }
    }
}
