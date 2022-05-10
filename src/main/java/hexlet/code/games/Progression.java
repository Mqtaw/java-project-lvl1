package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public final class Progression implements Game {

    public String getDescription() {
        return "What number is missing in the progression?";
    }

    public String[] getQuestionAndResult() {
        final int minBound = 5;
        final int maxBound = 10;
        final int maxDelta = 15;

        final int firstValue = new Random().nextInt(100);
        final  int arrayLength = new Random().nextInt(maxBound - minBound) + minBound;
        final int delta = new Random().nextInt(maxDelta);
        final int answerPosition =  new Random().nextInt(arrayLength);

        String answer = "";
        String[] progression = new String[arrayLength];

        int temp = firstValue;
        for (var position = 0; position < arrayLength; position++) {
            if (answerPosition == position) {
                progression[position] = "..";
                answer = String.valueOf(temp);
            } else {
                progression[position] = String.valueOf(temp);
            }
            temp += delta;
        }

        return new String[] {String.join(" ", progression), answer};
    }
}
