import java.util.Arrays;
import java.util.Scanner;

public class ArrayExScan {
	public static int Sum_total(int[] stscore) {
		// 전체 학생의 합계와 평균을 구하는 메소드
		int sum = 0;
		int avg;
		
		for(int i = 0; i < stscore.length; i++) {
			sum += stscore[i];
		}
		avg = sum / stscore.length;
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + avg);
		return avg;
	}
	
	public static void main(String[] args) {
		// 학생수를 입력 받아 배열을 정의 (5~10명 범위)
		int stcount;
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력 : ");
		stcount = sc.nextInt(5)+1;
		
		for (int i = 0; i < stcount.length; i++) {
			if (stcount > sc.nextInt(5)+1) {
				System.out.println("학생 수 다시 입력 : ");
				stcount = sc.nextInt();
			}
			else if (stcount > sc.nextInt(10)+1) {
				System.out.println("학생 수 다시 입력 : ");
				stcount = sc.nextInt();
			}
		}
			
		// 학생 수 만큼 점수를 입력 받음
		int [] stscore = new int [stcount];
		Scanner sn = new Scanner(System.in);
		
		for (int i = 0; i < stscore.length; i++) {
			System.out.println("학생 점수 입력 : ");
			stscore[i] = sn.nextInt();
		}
		
		// 메소드를 이용해 합계, 평균 출력
		Sum_total(stscore);
		
		// 점수를 성적순으로 출력
		int temp;
		
		for (int i = 0; i < stscore.length; i++) {
			for (int j = i + 1; j < stscore.length; j++) {
				if (stscore[i] < stscore[j]) {
					temp = stscore[i];
					stscore[i] = stscore[j];
					stscore[j] = temp;
				}
			}
		}
		System.out.println("점수는 = " + Arrays.toString(stscore));
		sn.close();
		sc.close();
	}
}