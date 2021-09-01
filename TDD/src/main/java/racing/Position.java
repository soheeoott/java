package racing;

class Position {

    private static final String ERROR_MESSAGE_INPUT_MOVE_RANGE = "자동차를 움직이려면 1부터 9까지 범위 이내의 숫자여야 합니다.";

    private static final int INPUT_MIN_RANGE_NUMBER = 1;
    private static final int INPUT_MAX_RANGE_NUMBER = 9;
    private static final int FORWARD_REQUIREMENT_NUMBER = 4;

    private int position = 0;

    public Position(int position) {
        this.position = position;
    }

    Boolean inputRangeCondition(int randomNumber) {
        return randomNumber < INPUT_MIN_RANGE_NUMBER || randomNumber > INPUT_MAX_RANGE_NUMBER;
    }

    Boolean MovedCondition(int randomNumber) {
        return randomNumber >= FORWARD_REQUIREMENT_NUMBER;
    }

    public Position positionForwardCondition(int randomNumber) throws Exception {

        if (inputRangeCondition(randomNumber)) {
            throw new Exception(ERROR_MESSAGE_INPUT_MOVE_RANGE);
        }

        if (MovedCondition(randomNumber)) {
            return new Position(this.position++); // 값 객체로 변경
        }
        return new Position(this.position);
    }
}