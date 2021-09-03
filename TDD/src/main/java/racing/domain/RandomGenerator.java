package racing.domain;

import java.util.Random;

public class RandomGenerator {

    private static final int RANDOM_RANGE = 10;
    private static Random random;

    public RandomGenerator() {
        random = new Random();
    }

    public int randomNumber() {
        return random.nextInt(RANDOM_RANGE);
    }
}
