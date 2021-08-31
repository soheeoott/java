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

    public void inputCarQuantity(int carQuantity) {
        this.carQuantity = carQuantity;
    }

    public void inputTryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public int getCarQuantity() {
        return carQuantity;
    }

    public int getTryCount() {
        return tryCount;
    }
}