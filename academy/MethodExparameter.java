package day0319;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodExparameter {
	public static boolean dupCheck(int[] lotto, int i) {
		System.out.println("in Method before => lotto"+lotto+" , i="+i);
		System.out.println("in Method before => lotto[]"+Arrays.toString(lotto));
		for (int j=0; j<i; j++) {
			if (lotto[j] == lotto[i]) {
				return true ;  // return 값이 있는 메서드에서는 return 을 만나면 메서드 종료
			} // if	
		} // for
		i+=100;
		lotto[5]=45;
		System.out.println("in Method after => lotto"+lotto+" , i="+i);
		System.out.println("in Method after => lotto[]"+Arrays.toString(lotto));
		return false;
	} // dupCheck
	
	public static void main(String[] args) {
		// 1.1) 당첨번호를 만들기
		int[] lotto = new int[6];
		Random rn = new Random(5);
		//for (int i = 0; i < lotto.length; i++) {
		for (int i = 0; i < 2; i++) {
			lotto[i] = rn.nextInt(45) + 1;
			// 중복확인
			if (dupCheck(lotto,i)) { 
					--i;
			} // if
			// CallByReference & CallByValue 비교 확인
			// i 는 23행의 영향 없음, lotto 는 24행의 영향 있음
			System.out.println("in Main => lotto"+lotto+" , i="+i); 
			System.out.println("in Main => lotto[]"+Arrays.toString(lotto));
		} // for_i

	} // main
} // class
