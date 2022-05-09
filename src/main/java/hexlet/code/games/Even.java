package hexlet.code.games;

public final class Even implements Game {

    public String getDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String[] getQuestionAndResult() {
        final var convertIndex = 100;
        int question = (int) (Math.random() * convertIndex);

        boolean isEven;
        String answer;
        isEven = (question % 2) == 0;

        if (isEven) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[] {String.valueOf(question), answer};
    }
}
