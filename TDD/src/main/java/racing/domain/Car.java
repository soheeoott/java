package racing.domain;

public class Car { // 의존관계 (외부에 어떻게 영향을 끼칠지)

    private static final String ERROR_MESSAGE_INPUT_MOVE_RANGE = "1부터 9까지 범위 이내의 숫자만 자동차를 움직일 수 있습니다.";

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE= 9;
    private static final int FORWARD_REQUIREMENT_NUMBER = 4;

    private Position position;

    public Car(Position position) {
        this.position = position;
    }

    // 입력 범위 조건
    private Boolean inputRangeCondition(int randomNumber) {
        return randomNumber < MIN_RANGE || randomNumber > MAX_RANGE;
    }

    // 전진 조건
    private Boolean movedCondition(int randomNumber) {
        return randomNumber >= FORWARD_REQUIREMENT_NUMBER;
    }

    public Position forwardCondition(int randomNumber) { // 나눠야 하지 않을까?? (입력 범위, 전진 조건)

        int loadPositionCurrent = position.loadPositionObj(); // position.loadPositionObj() 얘는 안 변함

        if (inputRangeCondition(randomNumber)) { // 입력 범위 체크
            throw new IllegalArgumentException(ERROR_MESSAGE_INPUT_MOVE_RANGE);
        }

        if (movedCondition(randomNumber)) { // 전진 조건 체크, 증가값을 어떻게 주지 = 위치를 복사
//            return position = (loadPositionCurrent + 1); // 복사
        }
        return new Position(loadPositionCurrent);
    }

    public Position loadPosition() {
        return position;
    }
}