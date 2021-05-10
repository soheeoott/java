public class OperRelEx {
	public static void main(String[] args) {
		// 관계 연산  > 같다(==), 크다(>), 작다(<), 크거나같다(>=), 작거나 같다(<=), 다르다(!=)
		int x = 10;
		int y = 3;
		
		System.out.println("x == y : " + (x == y));
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x != y : " + (x != y));
		
		// 논리연산 => &&(and), ||(or), !(not)
		boolean truth = true;
		truth = (x%2==0) && (y%2==0);
		System.out.println("&& : " + truth);
		
		// x, y 둘중 하나가 짝수인가?
		truth = (x%2==0) || (y%2==0);
		System.out.println("|| : " + truth);
		
		// not : 2번의 부정
		System.out.println("부정 : " + !truth);
		
		// 삼항식 : 두수 x,y 를 비교해서 큰 수를 출력
		y = 25;
		int maxValue = (x > y) ? x : y;
		System.out.println("maxValue : " + maxValue);

		String resultBln = (x > y) ? "참" : "거짓";
		System.out.println("resultBln : " + resultBln);

		boolean bln = (x > y) ? true : false;
		System.out.println("b : " + bln);

		char chBln = (x > y) ? 'T' : 'F';
		System.out.println("chBln : " + chBln);
	}
}