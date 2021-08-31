package racing;

public class Run {

    public static void main(String[] args) {

        InputView input = new InputView();
        ResultView result = new ResultView();

        // 자동차 대수와 시도 회수 입력
        input.inputValue();

        // 자동차 대수 객체 생성 및 초기값 설정
        Car[] cars = new Car[input.getCarQuantity()]; // 배열 개념 -> 고치기

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(0); // 의미있는 상수
        } // 생성자 인자를 사용한 이유

        // 전진 조건 체크 후 출력
        result.racingResult(cars, input);
    }
}