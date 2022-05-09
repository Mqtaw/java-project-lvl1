package hexlet.code.games;

public final class Prime implements Game {

    public String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String[] getQuestionAndResult() {
        final var convertIndex = 100;
        int question = (int) (Math.random() * convertIndex);

        if ((question == 0)  || (question == 1)) {
            return new String[] {String.valueOf(question), "yes"};
        }

        boolean isSimple = true;
        for (var i = 2; i < question; i++) {
            if (question % i == 0) {
                isSimple = false;
                break;
            }
        }
        String answer;
        if (isSimple) {
            answer = "yes";
        } else {
            answer = "no";
        }
        return new String[] {String.valueOf(question), answer};
    }
}
