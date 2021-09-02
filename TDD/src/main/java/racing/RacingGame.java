package racing;

import racing.domain.Car;
import racing.domain.Position;
import racing.domain.RacingInformation;
import racing.domain.RandomGenerator;
import racing.view.InputView;

import java.util.List;
import java.util.Random;

public class RacingGame {

    private static InputView inputView;
    private static RacingInformation racingInformation;
    private static List<Car> cars;
    private static Position position;
    private static RandomGenerator randomGenerator;

    private static final int LOOP_START = 0;
    private static int carQuantity;
    private static int tryCount;

    public static void ready() {
        // 입력값 설정
        inputView = new InputView();
        carQuantity = inputView.setUpCarQuantity();
        tryCount = inputView.setUpTryCount(); // 입력에서 레이싱정보를 변경하려고 했는데 NullPointerException 발생

        // 레이싱 정보값 설정 (차 대수, 시도 횟수)
        racingInformation = new RacingInformation(carQuantity, tryCount);
        cars = racingInformation.loadCars();
    }

    public static void start() {
        System.out.println("실행 결과");

        // 반복문 (시도 횟수, 차 대수)
        loopTryCountStart(racingInformation.loadTryCount());
    }

    public static void loopTryCountStart(int tryCount) {

        for (int i = LOOP_START; i < tryCount; i++) {
            loopCarQuantityStart(racingInformation.loadCars());
            System.out.println("");
        }
    }

    public static void loopCarQuantityStart(List<Car> cars) {

        for (int i = LOOP_START; i < cars.size(); i++) {

            randomGenerator = new RandomGenerator();
            int randomNumber = randomGenerator.randomNumber();

            // 자동차가 위치를 변경
            position = cars.get(i).forwardCondition(randomNumber);

            resultPrint(position.loadPositionObj());
            System.out.println("");

//            System.out.println("현재 위치 : " + position.loadPositionObj());
        }
    }

    public static void resultPrint(int movePosition) {

        for (int i = LOOP_START; i < movePosition; i++) {
            System.out.print("-");
        }
    }

    public static void main(String[] args) {
        ready();
        start();
//        result();
    }
}