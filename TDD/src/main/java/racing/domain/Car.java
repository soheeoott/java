package racing.domain;

public class Car { // 의존관계 (외부에 어떻게 영향을 끼칠지)

    private static final String ERROR_MESSAGE_INPUT_MOVE_RANGE = "자동차를 움직일 수 있는 숫자의 범위는 1이상 9이하입니다.";

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE= 9;
    private static final int FORWARD_REQUIREMENT_NUMBER = 4;
    private static final int INCREASE = 1;

    private Position position;

    public Car(Position position) {
        this.position = position;
    }

    private Boolean inputRangeCondition(int randomNumber) {
        return randomNumber < MIN_RANGE || randomNumber > MAX_RANGE;
    }

    private Boolean movedCondition(int randomNumber) {
        return randomNumber >= FORWARD_REQUIREMENT_NUMBER;
    }

    // 체크 로직 나눠야 하지 않을까?? (입력 범위, 전진 조건)
    public Position move(int randomNumber) {

        int loadPositionCurrent = position.loadPositionObject();

        if (inputRangeCondition(randomNumber)) {
            throw new IllegalArgumentException(ERROR_MESSAGE_INPUT_MOVE_RANGE);
        }

        if (movedCondition(randomNumber)) {
            loadPositionCurrent += INCREASE;
            return position = new Position(loadPositionCurrent);
        }
        return position = new Position(loadPositionCurrent);
    }

    public Position loadPosition() {
        return position;
    }
}