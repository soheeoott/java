package racing.domain;

import java.util.Random;

public class RandomGenerator {

    private static final int RANDOM_RANGE = 10;
    private static Random random;

    public RandomGenerator() {
        random = new Random();
    }

    // 메소드로 분리하면 도트 연산자가 늘어나지만, 재사용성이 높지 않을까...
    public int randomNumber() {
        return random.nextInt(RANDOM_RANGE);
    }
}
