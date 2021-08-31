package racing;

import java.util.Scanner;

public class InputView {

    public int carQuantity = 0;
    public int tryCount = 0;

    public void inputValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("자동차 대수는 몇 대 인가요?");
        inputCarQuantity(sc.nextInt());

        System.out.println("시도할 회수는 몇 회 인가요?");
        inputTryCount(sc.nextInt());
    }

    void inputCarQuantity(int carQuantity) {
        this.carQuantity = carQuantity;
    }

    void inputTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    int getCarQuantity() {
        return carQuantity;
    }

    int getTryCount() {
        return tryCount;
    }
}