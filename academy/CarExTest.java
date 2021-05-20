public class CarExTest {	
	public static void main(String[] args) {
		Car carNewF = new Car(); // 객체화, 인스턴스 정의, 생성
		carNewF.speed = 1000;
		carNewF.speed += 100;
		carNewF.mileage = 100000 + (carNewF.speed * 60);
		carNewF.color = "Gray";
		
		carNewF.speedUp();
		carNewF.speedDown();
		System.out.println("carNewF.toString() : " + carNewF.toString());
		System.out.println("carNewF : " + carNewF);

		Car carNewS = new Car();
		carNewS.speed = 2000;
		carNewS.mileage = 200000;
		carNewS.color = "Red";
		carNewS.speedDown();
		System.out.println("carNewS : " + carNewS);
		
		carNewS = new Car();
		System.out.println("새로 생성한 carNewS : " + carNewS);
		carNewS = null;
		System.out.println("carNewS_null : " + carNewS); // 연결 해제

		carNewS = carNewF;
		System.out.println("carNewS_carNewF : " + carNewS);
		System.out.println("carNewS.color : " + carNewS.color);

		carNewS.color = "Black";
		System.out.println("carNewF.color : " + carNewF.color + ", carNewS.color : " + carNewS.color);
	}
}