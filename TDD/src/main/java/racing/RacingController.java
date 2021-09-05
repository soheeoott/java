package racing;

import racing.domain.Car;
import racing.domain.Position;
import racing.domain.RacingInformation;
import racing.domain.RandomGenerator;
import racing.view.InputView;

import java.util.List;

public class RacingController {

    private static InputView inputView;
    private static RacingInformation racingInformation;
    private static List<Car> cars;
    private static Position position;
    private static RandomGenerator randomGenerator;

    private static final String RESULT_MESSAGE = "실행 결과 \n";
    private static final String POSITION_SIGN = "-";

    private static final int LOOP_START = 0;
    private static int carQuantity;
    private static int tryCount;

    private void printMessage(String message) {
        System.out.print(message);
    }

    private void newLine() {
        System.out.println("");
    }

    public void ready() {
        // 입력값 설정
        inputView = new InputView();
        carQuantity = inputView.setUpCarQuantity();
        tryCount = inputView.setUpTryCount(); // 입력 -> 레이싱정보 변경 : NullPointerException 발생

        // 레이싱 정보값 설정 (차 대수, 시도 횟수)
        racingInformation = new RacingInformation(carQuantity, tryCount);
        cars = racingInformation.loadCars();
    }

    public void start() {
        racingStart(racingInformation.loadTryCount());
    }

    void result() {
        printMessage(RESULT_MESSAGE);
        // 담겨있는거
    }

    // 반복문 (시도 횟수, 차 대수)
    private void racingStart(int tryCount) {
        for (int i = LOOP_START; i < tryCount; i++) {
            racingMove(racingInformation.loadCars());
            newLine();
        }
    }

    private List<Car> racingMove(List<Car> cars) { // 분리 필요
        randomGenerator = new RandomGenerator();

        for (Car car : cars) {
            position = car.move(randomGenerator.randomNumber());
            resultPrint(position.loadPositionObject());
            newLine();
        }
        // ResultView로 분리 필요 -> car
        // 경주를 끝낸 후 화면을 그려주는 역할
        return this.cars = cars;
    }

    private void resultPrint(int movePosition) { // ResultView로 분리 필요
        for (int i = LOOP_START; i < movePosition; i++) {
            printMessage(POSITION_SIGN);
        }
    }
}
