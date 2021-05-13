import java.util.Scanner;

public class IfExScan {
	public static void main(String[] args) {
		// Scanner를 이용해서 다음 내용을 입력 받아 출력
		// 만약 날씨가 좋고 공휴일이면 공원에 산책을 간다.
		// 조건1. 오늘의 날씨 [맑음, 흐림, 비, 태풍] 
		// 조건2. 오늘은 공휴일 인가요? [예, 아니요]
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘의 날씨 선택 /n"); // (">%n"); 
		System.out.println("1.맑음 2.흐림 3.비 4.태풍");
		String wether = sc.nextLine();
		
		System.out.println("오늘은 공휴일 인가요? /n"); // (">%n"); 
		System.out.println("1.예 2.아니요");
		String hoilday = sc.nextLine();
		
		/* 방법(1)
		if (wether.equals("1"))
			if (hoilday.equals("1"))
				System.out.println("공원에 산책가기");
			else
				System.out.println("공부하기");
		
		if (wether.equals("2"))
			if (hoilday.equals("1"))
				System.out.println("공부하기");
			else
				System.out.println("공부하기");
		
		if (wether.equals("3"))
			if (hoilday.equals("1"))
				System.out.println("공부하기");
			else
				System.out.println("공부하기");
		
		if (wether.equals("4"))
			if (hoilday.equals("1"))
				System.out.println("공부하기");
			else 
				System.out.println("공부하기");
		
		sc.close();
		*/
		
		/* 방법(2)
		if (wether.equals("1") && hoilday.equals("1")) {
			System.out.println("공원에 산책가기");
			System.out.println("도서관 가기");
		} else {
			System.out.println("방콕");
			System.out.println("공부하기");
		}
		sc.close();
		*/
		
		/* 방법(3)
		if (wether.equals("1")) {
			if (hoilday.equals("1")) {
				System.out.println("공원에 산책가기");
				System.out.println("도서관 가기");
			}
			else {
				System.out.println("걸어서 출근하기");
				System.out.println("열심히 근무 하기");
			}
		} else {
			if (hoilday.equals("1")) {
				System.out.println("방콕");
				System.out.println("공부 하기");
			} else {
				System.out.println("차로 출근하기");
				System.out.println("열심히 근무 하기");
			}
		}
		sc.close();
		*/
	}
}