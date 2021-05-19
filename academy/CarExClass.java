public class CarExClass {
	public int speed;
	public int mileage;
	public String color;
	
	// 메서드 : 동작 또는 기능 구현
	public void speedUp() {
		int k = 100;
		speed += 10;
	}
	
	public void speedDown() {
		// k = 100;
		speed -= 10;
	}

	public String toString() { // 리턴 값이 있을 때 type 지정
		return "속도 = " + speed + ", 주행거리 = " + mileage + ", 색상 = " + color;
	}
}