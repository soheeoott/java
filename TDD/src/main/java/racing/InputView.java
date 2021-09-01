package racing;

import java.util.Scanner;

public class InputView {

    private static final String MESSAGE_USER_INPUT_CAR_QUANTITY = "자동차 대수는 몇 대 인가요?";
    private static final String MESSAGE_USER_INPUT_TRY_COUNT = "시도할 회수는 몇 회 인가요?";

    private int setUpCarQuantity (Scanner scanner) throws Exception {
        System.out.println(MESSAGE_USER_INPUT_CAR_QUANTITY);

//        if (scanner.nextInt() > 0 || scanner.nextInt() > 9) { // 메소드 ?
//            throw new Exception("1~9 범위 이내의 숫자를 입력해주세요.");
//        }
        return scanner.nextInt();
    }

    // 10회로 한정
    private int setUpTryCount (Scanner scanner) throws Exception {
        System.out.println(MESSAGE_USER_INPUT_TRY_COUNT);

//        if (scanner.nextInt() > 0 || scanner.nextInt() > 9) { // 메소드 ?
//            throw new Exception("1~9 범위 이내의 숫자를 입력해주세요.");
//        }
        return scanner.nextInt();
    }

    public void setUpRacingGame () throws Exception {
        Scanner scanner = new Scanner(System.in);
        int carQuantity = setUpCarQuantity(scanner);
        int tryCount = setUpTryCount(scanner);
    }
}