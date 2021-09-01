package racing;

import java.util.Random;

public class RandomGenerator {

    private static final int RANDOM_RANGE = 10;
    private static final Random random = new Random();

    public int randomNumber() {
        return random.nextInt(RANDOM_RANGE);
    }
}
