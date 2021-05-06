import java.util.*;

public class PrintfEx {
	public static void main(String[ ] args) {
		System.out.printf("금액 : %d원\n", 123); 
		System.out.printf("금액 : %6d원\n", 123); 
		System.out.printf("금액 : %-6d원\n", 123); 
		System.out.printf("금액 : %06d원\n", 123); 
		System.out.printf("반지름이 %d 인 원의 넓이 : %10.2f\n",10,Math.PI*10*10); 
		System.out.printf("%6s은 %6d학년 %10s 입니다.%n", "홍길동", 1, "학생"); 
		
		Date now = new Date() ;
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.%n", now, now, now); 
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.%n", now); 
		System.out.printf("지금은 %1$tH시 %1$tM분 %1$tS초 입니다.%n", now); 
				
		char c='A';
		c = 'B';
		
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		int octNum = 010; // 8진수
		int hexNum = 0x10; // 16진수
		int binNum = 0b10; // 2진수
		
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n",  finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%#o, %d%n", octNum, octNum);   
		System.out.printf("hexNum=%#x, %d%n", hexNum, hexNum);   
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);  
		
		int f = Float.SIZE ; // 단위 bit
		System.out.printf("Float.SIZE=%d%n", f);
	}
}