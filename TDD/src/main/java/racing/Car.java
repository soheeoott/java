package racing;

public class Car { // 의존관계 생각해보기 (외부에 어떻게 영향을 끼칠지)

    public Position position;   // 원시값 포장
    public String mileage = ""; // 주행 거리

    public void forwardCheck(int randomNumber) {

        if (position.forwardCondition(randomNumber)) { //  메소드 호출
            // 이동
            position.position++; // 값 객체로 변경
        }
    }

    public Position currentPosition() {
        return position;
    }

    public String currentMileage() {
        return mileage;
    }
}

class Position {

    public int position; // 이름 변경 필요

    // 생성자에게 검증 코드 위임
    public Position(int randomNumber) throws Exception {

        if (randomNumber < 0 || randomNumber == 10) {
            throw new Exception("1~9까지의 숫자를 입력해주세요.");
        }
    }

    Boolean forwardCondition (int randomNumber) {
        return randomNumber >= 4;
    }
}