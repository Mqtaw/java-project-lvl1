package hexlet.code.games;

public final class GCD implements Game {

    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String[] getQuestionAndResult() {
        final var convertIndex = 100;
        int num1 = (int) (Math.random() * convertIndex);
        int num2 = (int) (Math.random() * convertIndex);

        String question = num1 + " " + num2;

        var min = Math.min(num2, num1);

        for (var gcd = min; gcd > 0; gcd--) {
            if ((num1 % gcd == 0) && (num2 % gcd == 0)) {
                return new String[] {question, String.valueOf(gcd)};
            }
        }
        return null;
    }
}
