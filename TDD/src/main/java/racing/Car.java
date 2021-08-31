package racing;

public class Car { // 의존관계 생각해보기 (외부에 어떻게 영향을 끼칠지)

    public int position; // 객체로 원시값을 포장 position 클래스 (-1, 10) 체크 -> 생성자에게 검증 코드를 위임

    public String moveStreet = "";

    public Car(int position) {
        this.position = position;
    }

    public void forwardCheck(int randomNumber) {

        if (randomNumber >= 4) { //  메소드를 호출하는 방식
            // 이동
            position++; // 값 객체로 변경
        }
    }

    public int getPosition() { // 의미있는 메소드명으로 수정 필요
        return position;
    }

    public String getMoveStreet() { // 의미있는 메소드명으로 수정 필요
        return moveStreet;
    }
}