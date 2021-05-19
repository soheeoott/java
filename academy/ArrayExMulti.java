public class ArrayExMulti {
	public static void main(String[] args) {
		// 명시적 선언
		int[][] mul_mg;
		mul_mg = new int[2][3];
		
		// 초기화
		mul_mg[0][0] = 10;
		mul_mg[0][1] = 20;
		mul_mg[0][2] = 30;
		mul_mg[1][0] = 40;
		mul_mg[1][1] = 50;
		mul_mg[1][2] = 60;
		 
		// 활용
		mul_mg[1][0] += mul_mg[0][0];
		mul_mg[1][1] += mul_mg[0][1];
		mul_mg[1][2] += mul_mg[0][2];
		
		// 출력
		for (int i = 0; i < mul_mg.length; i++) {
			for (int j = 0; j < mul_mg[i].length; j++) {
				System.out.printf("mul_mg [%d, %d] = %d \n", i, j, mul_mg[i][j]);
			}
		}

		// 묵시적 선언 : 행 단위로 출력
		int[][] mul_muk = {{100, 200, 300},{400, 500, 600},{111, 222, 333}};
		for (int i = 0; i < mul_muk.length; i++) {
			for (int j = 0; j < mul_muk[i].length; j++) {
				System.out.printf("%d\t", mul_muk[i][j]);
			}
			System.out.println("");
		}
	}
}