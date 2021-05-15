import java.util.Scanner;

public class SwitchExDay {
	// switch - case - break
	// 1. switch(key) 문의 인자로 사용 가능 (int, char, String)
	// 2. break : 무조건 탈출
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 : ");
		
		int key = Integer.parseInt(sc.nextLine());
        switch (key) {
            case 0:
                System.out.println("0순위");
                break;
            case 1:
                System.out.println("1순위");
                break;
            case 2:
                System.out.println("2순위");
                break;
            case 3:
                System.out.println("3순위");
                break;
            default:
                System.out.println("error");
                break;
        }
		
		if (key == 1) {
			System.out.println("요일의 약자를 입력 : ");
			String day = sc.nextLine();
			switch (day) {
			case "M": 
				System.out.println("월요일");
				break;
			case "T": 
				System.out.println("화요일");
				break;
			case "W": 
				System.out.println("수요일");
				break;
			case "TH": 
				System.out.println("목요일");
				break;
			case "F": 
				System.out.println("금요일");
				break;
			default: 
				System.out.println("휴일");
				break;
			}
		}
		System.out.println("종료");
		sc.close();
		
		char jobCode = 'C';
		switch (jobCode) {
			case 'A': 
				System.out.println("개발자");
				break;
			case 'B': 
				System.out.println("강사");
				break;
			case 'C': 
				System.out.println("음악가");
				break;
			case 'D': 
				System.out.println("미술가");
				break;			
			default: 
				System.out.println("Error");
				break;
		}
		
		String day = sc.nextLine();
		switch (day) {
			case "M": 
				System.out.println("월요일");
				break;
			case "T": 
				System.out.println("화요일");
				break;
			case "W": 
				System.out.println("수요일");
				break;
			case "TH": 
				System.out.println("목요일");
				break;
			case "F": 
				System.out.println("금요일");
				break;
			default: 
				System.out.println("휴일");
				break;
		}		
	}
}