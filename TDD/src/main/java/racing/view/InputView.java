package racing.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {

    private static final String INPUT_MESSAGE_CAR_QUANTITY = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_MESSAGE_TRY_COUNT = "시도할 회수는 몇 회 인가요?";
    private static final String ERROR_MESSAGE_INPUT_VALIDATE = "숫자만 입력 가능합니다.";

    private static Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    public int setUpCarQuantity() {
        printMessage(INPUT_MESSAGE_CAR_QUANTITY);
        return inputValidate();
    }

    public int setUpTryCount() {
        printMessage(INPUT_MESSAGE_TRY_COUNT);
        return inputValidate();
    }

    // 입력값이 숫자인지 체크
    private int inputValidate() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException(ERROR_MESSAGE_INPUT_VALIDATE);
        }
    }
}