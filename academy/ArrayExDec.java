public class ArrayExDec {
	public static void main(String[] args) {		
		// 5명 학생의 점수를 처리
		// 1. 명시적 선언 : 크기를 반드시 지정
		int[] score1 = new int[5];
		int s = 5;
		int[] score;
		score = new int[s];
		
		// score[0] = 100; score[1] = 90; .... score[4] = 90;
		for (int i = 0; i < score.length; i++) {
			score[i] = 20 * i + 40;
			System.out.printf("score[%d] = %d \n", i, score[i]);
		}
		
		// 2. 묵시적 선언 : 선언과 동시에 초기화
		int[] score2 = {50, 60, 70, 80, 90, 40, 90}; // 초기값을 직접 설정
		System.out.println("** 묵시적 선언 score2 출력 **");
		for (int i = 0; i < score2.length; i++) {
			System.out.printf("score[%d] = %d \n", i, score2[i]);
		}
		
		// 3. 활용(합계, 평균)
		int sum = 0; float avg = 0;
		for ( int i = 0; i < score2.length; i++) {
			sum += score2[i];
		}
		avg = (float)sum / score2.length;
		System.out.printf("총합계 = %d, 반평균 = %f \n", sum, avg);
		
		// 4. for each
		for (int i : score2) {
			System.out.print(i + "\t");
		}
	}
}