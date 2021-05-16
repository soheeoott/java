import java.util.Scanner;

public class SwitchExLeap {
	// 1. 월을 입력 받아서
	// 2. 몇일까지 인지
	// - 1, 3, 5, 7, 8, 10, 12월 => ?월은 31일까지 입니다.
	// - 4, 6, 9, 11월 => ?월은 30일까지 입니다.
	// - 2월 => ?월은 29일까지 입니다.
	// 3. 무슨 계절인지 출력 하기
	// - 3 ~ 5 : 봄, 6 ~ 8 : 여름, 9 ~ 11 : 가을, 12 ~ 2 : 겨울
	
	public static void main(String[] args) {
		// 1. 월을 입력 받기
		Scanner sc = new Scanner(System.in);
		int month = 1;
		String msg = " ";
		
		System.out.print("달을 입력 : ");
		month = sc.nextInt();
		sc.close();
		
		// 2. 몇일까지 인지 출력 (1)
		int year = 2020;
		switch (month) {
			// break가 없을 시 코드가 아래로 진행 => 생략가능
			case 1: case 3: case 5: 
			case 7: case 8: case 10:
			case 12: msg = "31"; break;

			case 4: case 6: case 9:
			case 11: msg = "30"; break;
		
			// 윤년 적용 : 4로 나눠지면서 100으로는 나누어지지 않거나 400으로는 나눠지는 해 (year)
			case 2:  if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				msg = "29(윤년)";
			else msg = "28(평년)";
		 	break;
		
			default: msg = "Error"; 
		}
		System.out.println(month + "월은 "+ msg + " 일 까지 입니다.");
		
		// 2. 몇일까지 인지 출력 (2)
		Scanner sc = new Scanner(System.in); System.out.println("월을 입력 : ");
		String month = sc.nextLine(); 
	  
		switch(month) {  
			case "1" : case "3" : case "5" : case "7" : 
			case "8" : case "10" : case "12" : 
				System.out.println(month + "월은 31일까지 입니다.");
				break;
		  
			case "4" : case "6" : 
			case "9" : case "11" :
				System.out.println(month + "월은 30일까지 입니다.");
				break;
		  
			case "2" : 
				System.out.println(month + "월은 29일까지 입니다.");
				break;
		default: 
			System.out.println("Error");
			break;
		}
		  
		switch(month) {
			case "3" : case "4" : case "5" : 
				System.out.println(month + "월은 봄"); 
				break;
			case "6" : case "7" : case "8" : 
				System.out.println(month + "월은 여름"); 
				break;
			case "9" : case "10" : case "11" : 
				System.out.println(month + "월은 가을");
				break;
			case "12" : case "1" : case "2" : 
				System.out.println(month + "월은 겨울");
				break;
			default: System.out.println("Error"); 
				break;
		}	 
		sc.close();
		
		// 3. 무슨 계절인지 출력
		String MtoS = "안내문";
		switch(month) {
			case 12:
			case 1:
			case 2: MtoS="겨울입니다. "; break;
			case 3: case 4: case 5: MtoS="봄날입니다. "; break; 
			case 6: case 7: case 8: MtoS="여름입니다. "; break;
			case 9: case 10: case 11: MtoS="가을입니다. "; break;
			default : MtoS="error"; break;
		}
		System.out.println(month + "월은" + MtoS);
	}
}