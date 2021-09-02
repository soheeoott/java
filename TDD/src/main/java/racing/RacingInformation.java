package racing;

public class RacingInformation {

    int carQuantity = 0;
    int tryCount = 0;

    public RacingInformation(int carQuantity, int tryCount) {
        this.carQuantity = carQuantity;
        this.tryCount = tryCount;
    }

    public int loadCarQuantity() {
        return carQuantity;
    }

    public int loadTryCount() {
        return tryCount;
    }
}