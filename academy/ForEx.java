public class ForEx {
	public static void main(String[] args) {
		// 1~100 까지의 합
		int result = 0; // 전역변수
		
		for (int i = 0; i < 100; i++) { // i : 지역변수
			result += (i + 1);
		}
		System.out.println("1~100 까지의 합 : " + result);
		
		// 자전거 돌리기 10번을 돌리면 1Kg이 감량, 100번 돌렸을때의 감량 출력하기
		int kg = 0;
		for (int k = 0; k < 100; k++) {
			if (k % 10 == 0) {
				kg++;
			}
		}
		System.out.println("총 감량 Kg : " + kg + " Kg");
		
		int total = 0;
		for (int i = 0; i < 10; i++) { // 자전거
			for (int j = 0; j < 10; j++) { // 줄넘기
				System.out.printf("[" + i + ", " + j + "]");
				total++;
			}
			System.out.println("");
		}
		System.out.println("줄넘기 횟수 : " + total + " 회");
	}
}