package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void even(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        boolean isSuccess = true;
        final var iterations = 3;
        for (var i = 0; i < iterations; i++) {
            final var convertIndex = 100;
            int question = (int) (Math.random() * convertIndex);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            Scanner sc = new Scanner(System.in);
            var answer = sc.nextLine();
            System.out.println(answer);

            boolean isEven;

            isEven = (question % 2) == 0;

            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
            } else {
                System.out.println("You made a mistake");
                isSuccess = false;
                break;
            }
        }
        if (isSuccess) {
            System.out.println("Congratulations " + name + "!");
        }
    }
}
