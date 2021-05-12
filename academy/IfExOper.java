import java.util.Scanner;

public class IfExOper {
	public static void main(String[] args) {
		// 삼항식을 if 문으로 변경
		int x = 10, y = 25;
		int maxValue = (x > y) ? x : y;
		maxValue = y;
		
		if (x > y) maxValue = x;
		System.out.println("int maxValue >"+ maxValue);
		
		if (x > y) maxValue = x;
		else maxValue = y;
		System.out.println("int maxValue >"+ maxValue);
		
		String result = (x > y) ? "참" : "거짓";
		System.out.println("String result >"+ result);
		
		if (x > y) result = "참";
		else result = "거짓";
		System.out.println("String result >"+ result);
		
		boolean b = (x > y) ? true : false;
		System.out.println("boolean b >"+ b);
		
		if (x > y) b = true;
		else b = false;
		System.out.println("boolean b >"+ b);
		
		char c = (x > y)? 'T' : 'F';
		System.out.println("char c > "+ c);
		
		if (x > y) c = 'T';
		else c = 'F';
		System.out.println("char c > "+ c);
	}
}