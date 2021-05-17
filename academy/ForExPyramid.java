public class ForExPyramid {
	public static void main(String[] args) {
		// 1) 삼각형 출력
		// - ★ 을 10 행 출력
		// - 각 행별로 행 번호 개수만큼 출력
		int i, j;
		for (i = 1; i < 11; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
		// 2) 피라미드 출력
		int num = 7;
		for (i = 1; i <= num; i++) {
			for (j = 1; j <= num-i; j++)
				System.out.print("  "); // 라인별 공백
		
			for (j = 1; j <= (2 * i - 1); j++)
				// i : 라인번호, 
				// (2 * i - 1) : 홀수찾기
				System.out.print("★");
				System.out.println();
		}		
	}
}