package racing;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_MESSAGE_CAR_QUANTITY = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_MESSAGE_TRY_COUNT = "시도할 회수는 몇 회 인가요?";
    private static final String ERROR_MESSAGE_INPUT_RANGE = "1부터 9까지 범위 이내의 숫자를 입력해주세요.";

    private static final int INPUT_MIN_RANGE_NUMBER = 1;
    private static final int INPUT_MAX_RANGE_NUMBER = 9;

    private static Scanner scanner;

    public InputView(Scanner scanner) throws Exception {
        this.scanner = scanner;
    }

    Boolean setUpRacingInputCheck (int inputNumber) {
        return inputNumber < INPUT_MIN_RANGE_NUMBER || inputNumber > INPUT_MAX_RANGE_NUMBER;
    }

    public int setUpCarQuantity (Scanner scanner) throws Exception {
        System.out.println(INPUT_MESSAGE_CAR_QUANTITY);

        int carQuantity = scanner.nextInt();

        if (setUpRacingInputCheck(carQuantity)) {
            throw new Exception(ERROR_MESSAGE_INPUT_RANGE);
        }
        return carQuantity;
    }

    // 10회로 한정
    public int setUpTryCount (Scanner scanner) throws Exception {
        System.out.println(INPUT_MESSAGE_TRY_COUNT);

        int tryCount = scanner.nextInt();

        if (setUpRacingInputCheck(tryCount)) {
            throw new Exception(ERROR_MESSAGE_INPUT_RANGE);
        }
        return tryCount;
    }
}

// 문자로 입력 받았을 때 => InputMismatchException
//    Boolean setUpRacingInputNumberCheck () {
//        try {
//            return scanner.nextInt(); // -> 문자인지 아닌지???? Character.digit() 사용?
//        } catch (InputMismatchException e) {
//            System.out.println();
//        }
//    }