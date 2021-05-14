import java.util.Scanner;

public class IfExElseIf {
	public static void main(String[] args) {
		// 90 이상 : A, 80 이상 : B, 70 이상 : C, 60 이상 : D, 나머지 F
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력 : ");
		int score = sc.nextInt();
		
		// else if (1)
		if (score >= 90) {
			System.out.println("점수 : " + score + ", 등급 : " + "A");
		} else if (score >= 80) {
			System.out.println("점수 : " + score + ", 등급 : " + "B");
		} else if (score >= 70) {
			System.out.println("점수 : " + score + ", 등급 : " + "C");
		} else if (score >= 60) {
			System.out.println("점수 : " + score + ", 등급 : " + "D");
		} else {
			System.out.println("점수 : " + score + ", 등급 : " + "F");
		}
		
		// else if (2)
		if (score >= 90) System.out.println("점수 : " + score + ", 등급 : " + "A");
		if (score >= 80) System.out.println("점수 : " + score + ", 등급 : " + "B");
		if (score >= 70) System.out.println("점수 : " + score + ", 등급 : " + "C");
		if (score >= 60) {
			System.out.println("점수 : " + score + ", 등급 : " + "D");
		} else {
			System.out.println("점수 : " + score + ", 등급 : " + "F");
		}
		sc.close();
	}
}