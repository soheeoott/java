package racing;

public class RacingCar { // 의존관계 생각해보기 (외부에 어떻게 영향을 끼칠지)

    public Position position;
    public String mileage = "";

    public Position currentPosition() {
        return position;
    }

    public String currentMileage() {
        return mileage;
    }
}