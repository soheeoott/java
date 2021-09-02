package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingInformation {

    private static List<Car> cars;

    int carQuantity = 0;
    int tryCount = 0;

    public RacingInformation(int carQuantity, int tryCount) {
        this.carQuantity = carQuantity;
        this.tryCount = tryCount;

        createCar();
    }

    // 자동차 대수 생성
    public List<Car> createCar() {
        cars = new ArrayList<>();

        for (int i = 0; i < loadCarQuantity(); i++) {
            this.cars.add(new Car(new Position(0)));
        }
        return cars;
    }

    public int loadCarQuantity() {
        return carQuantity;
    }

    public int loadTryCount() {
        return tryCount;
    }

    public List<Car> loadCars() {
        return cars;
    }
}