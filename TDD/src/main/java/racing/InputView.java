package racing;

import java.util.Scanner;

public class InputView {

    private static final String INPUT_MESSAGE_CAR_QUANTITY = "자동차 대수는 몇 대 인가요?";
    private static final String INPUT_MESSAGE_TRY_COUNT = "시도할 회수는 몇 회 인가요?";
    private static final String ERROR_MESSAGE_INPUT_RANGE = "1부터 9까지 범위 이내의 숫자를 입력해주세요.";

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 9;

    private static Scanner scanner = new Scanner(System.in);
    private static RacingInformation racingInformation;

    public void setUpReady() {
        System.out.println(INPUT_MESSAGE_CAR_QUANTITY);
        int carQuantity = setUpInput();

        System.out.println(INPUT_MESSAGE_TRY_COUNT);
        int tryCount = setUpInput();
        scanner.close();

        racingInformation = new RacingInformation(carQuantity, tryCount);
    }

    private int setUpInput () {
        int inputNumber = scanner.nextInt();

        if (inputRangeCheck(inputNumber)) {
            throw new IllegalStateException(ERROR_MESSAGE_INPUT_RANGE);
        }
        return inputNumber;
    }

    // 입력값 범위 체크
    Boolean inputRangeCheck (int inputNumber) {
        return inputNumber < MIN_RANGE || inputNumber > MAX_RANGE;
    }

    // 레이싱 정보 (자동차 대수, 시도 횟수)
    public RacingInformation loadRacingInformation() {
        return racingInformation;
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