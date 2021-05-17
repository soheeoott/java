import java.util.Arrays;

public class ArrayExType {	
	public static void main(String[] args) {
		// 타입별로 배열을 정의하고 출력
		// 1. float 또는 double
		float[] kg = {10, 20, 30, 44.4f, 55}; // 4byte * 5개
		System.out.println("Float Type : " + Arrays.toString(kg));
		for (float fl : kg)
			System.out.print(fl + "\t");
		System.out.println("");

		// 2. char
		char[] age = {'5', '6', '7', '8', '9'}; // 2byte * 5개
		System.out.println("age : ");
		for (char ch : age)
			System.out.print(ch + "\t");
		System.out.println("");
		
		// 3. String : 참조형 배열
		String[] name = {"가나", "다라", "마바", "사아", "자차"}; // 가변성 : 주소만 가짐
		name[3] = "카하"; // 변경
		System.out.println("String Type : ");
		for (String s : name)
			System.out.print(s + "\t");
		System.out.println("");
	}
}