import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodExparameter {
	public static boolean dupCheck(int[] lotto, int i) {
		System.out.println("(before) lotto : " + lotto + " , i= " + i);
		System.out.println("(before) lotto[] : "+Arrays.toString(lotto));
		for (int j = 0; j < i; j++) {
			if (lotto[j] == lotto[i]){
				return true;
			}
		}
		i += 100;
		lotto[5] = 45;
		System.out.println("(after) lotto : " + lotto + " , i=" + i);
		System.out.println("(after) lotto[] : "+ Arrays.toString(lotto));
		return false;
	}
	
	public static void main(String[] args) {
		// 당첨번호 만들기
		int[] lotto = new int[6];
		Random rn = new Random(5);
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rn.nextInt(45) + 1;
			// 중복확인
			if (dupCheck(lotto,i)) { 
					--i;
			}
			
			// CallByReference & CallByValue 비교
			System.out.println("(Main) lotto : " + lotto + " , i= " + i); 
			System.out.println("(Main) lotto[] : " + Arrays.toString(lotto));
		}
	}
}