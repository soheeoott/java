package racing;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_MESSAGE_CAR_QUANTITY = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_MESSAGE_TRY_COUNT = "시도할 회수는 몇 회 인가요?";
    private static final String ERROR_MESSAGE_INPUT_RANGE = "1 ~ 9까지의 숫자를 입력해주세요.";

    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    Boolean setUpRacingInputCheck () {
        return scanner.nextInt() < 1 || scanner.nextInt() > 9; // 입력 범위 : 1~9
    }

    private int setUpCarQuantity () throws Exception {
        System.out.println(INPUT_MESSAGE_CAR_QUANTITY);

        if (setUpRacingInputCheck()) {
            throw new Exception(ERROR_MESSAGE_INPUT_RANGE);
        }
        return scanner.nextInt();
    }

    // 10회로 한정
    private int setUpTryCount () throws Exception {
        System.out.println(INPUT_MESSAGE_TRY_COUNT);

        if (setUpRacingInputCheck()) {
            throw new Exception(ERROR_MESSAGE_INPUT_RANGE);
        }
        return scanner.nextInt();
    }
}