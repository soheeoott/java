import java.util.Scanner;

public class MethodEx {
	// 1) 매개변수, return 값 모두 없음
	public void typeOne() {
		System.out.println("메소드");
	}
	
	// 2) 매개변수는 있고, return 값 없음
	public static void typeTwo(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// 3) 매개변수는 없고, return 값 있음
	public static String typeThree() {
		return "Korea";
	}
	
	// 4) 매개변수는 있고, return 값 있음
	public static int typeFour(int i, int j, String s) {
		i += 10;
		j += 10;
		System.out.println("typeFour s, i, j : " + s + " , " + i + " , " + j);
		return (i * j);
	}
	
	public static void main(String[] args) {
		typeTwo("가길동", 30); 
		typeTwo("나길동", 35);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 두 번 입력 : ");
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("국적 : " + typeThree() + ", i * j = " + typeFour(i, j, "곱하기"));
		System.out.println("i, j : " + i + " , " + j);
		sc.close();
	}
}