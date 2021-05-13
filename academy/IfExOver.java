public class IfExOver {
	// 중첩 if
	public static void main(String[] args) {
		int x = 50, y = 20;
		if (x > y) {
			// 둘다 짝수이면 1등 당첨, x 값을 2배로 늘려준다.
			// 둘다 짝수가 아니면 2등 당첨, x 값을 1.5배로 늘려준다.
			if ((x % 2 == 0) && (y % 2 == 0)) {
				System.out.println("1등 당첨, 보너스 점수 > "+ (2 * x));
			} else {
				System.out.println("2등 당첨, 보너스 점수 > "+ (1.5 * x));
			}
		} else {
			// y가 홀수이면 3등 당첨, y 값을 1.5배로 늘려준다.
			// y가 홀수가 아니면 4등 당첨
			if (y % 2 != 0) 
				System.out.println("3등 당첨, 보너스 점수 > "+ (1.5 * y));
			else 
				System.out.println("4등 당첨");
		}
	}
}