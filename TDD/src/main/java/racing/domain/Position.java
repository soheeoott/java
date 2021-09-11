package racing.domain;

public class Position { // 포지션부터 테스트 코드

    private static final int INCREASE = 1;

    private int position;

    public Position(int position) {

//        try {
//            if (position < 0 || position < 10) {
//                throw new IllegalArgumentException("유효하지 않음");
//            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("유효하지 않는 값입니다.");
//        }

        this.position = position;
    }

    public int increasePosition () {
        int modifyPosition = loadPositionObject();
        int newPosition = modifyPosition + INCREASE;
        return newPosition;
    }

    public int loadPositionObject() {
        return this.position;
    }
}