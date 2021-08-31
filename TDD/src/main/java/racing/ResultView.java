package racing;

import java.util.Random;

public class ResultView {

    // 컨트롤러의 역할이랑 섞임
    public void racingResult(Car[] car, InputView input) {

        Random rndValue = new Random();
        // i = 0, j = 0 의미있는 상수값으로 변경 필요
        // 객체지향 개념 원시값

        for (int i = 0; i < input.getTryCount(); i++) {
            System.out.println((i+1) + "번째 주행");

            for (int j = 0; j < car.length; j++) { // for문은 메소드당 한 개만 사용

                // 기존 위치 값 저장 후 전진 조건 체크
                int oldPosition = car[j].getPosition();
                car[j].forwardCheck(rndValue.nextInt(10));

                // 기존 위치값과 조건 체크 이후 위치값을 비교, 위치값이 증가했다면 전진
                if (oldPosition < car[j].getPosition()) {
                    car[j].moveStreet += "-";
                }
                System.out.println(car[j].getMoveStreet());
            }
            System.out.println("");
        }
    }
}