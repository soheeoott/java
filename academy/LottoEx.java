import java.util.Random;

public class LottoEx01 {
	public static void main(String[] args) {
		int[] Lotto = new int[6];
		Random rd = new Random();
			
		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = rd.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				// 순차적으로 중복 검색, 중복 발견시 진행중인 반복문 중단
				if(Lotto[i] == Lotto[j]) {
					--i;
					break;
				}
			}
		}
		// 출력 (1)
		for (int i = 0; i < Lotto.length; i++) {
			System.out.printf("%d ",Lotto[i]);
		}
		
		// 출력 (2)
		for (int num : Lotto)
			System.out.printf("%d ",num);
		
		// 최대값 & 최소값 & 순차정렬
		int max = 0;
		for (int i = 0; i <Lotto.length; i++) {
			if (Lotto[i] > max) {
				max = Lotto[i];
			}
		}
		int min = 45;
		for (int i = 0; i < Lotto.length; i++) {
			if (Lotto[i] < min) {
				min = Lotto[i];
			}
		}
		System.out.printf("\n 최대값 : %d , 최소값 : %d \n", max, min);
	}
}