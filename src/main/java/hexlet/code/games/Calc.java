package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {

    public String getDescription() {
        return "What is the result of the expression?";
    }

    private char getOperator() {
        char[] operators = {'*', '+', '-'};
        int idx = new Random().nextInt(operators.length);
        return operators[idx];
    }


    public String[] getQuestionAndResult() {
        final var convertIndex = 25;
        int num1 = (int) (Math.random() * convertIndex);
        int num2 = (int) (Math.random() * convertIndex);

        char operator = getOperator();

        String question = num1 + " " + operator +  " " + num2;

        var answer = 0;

        switch (operator) {
            case '+':
                return new String[] {question, String.valueOf(num1 + num2)};
            case '-':
                return new String[] {question, String.valueOf(num1 - num2)};
            case '*':
                return new String[]{question, String.valueOf(num1 * num2)};
            default:
                break;
        }
        return null;
    }
}
