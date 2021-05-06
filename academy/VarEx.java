public class VarEx {
	public static void main(String[] args) {
		// 기본 자료형 : 정수형
		byte b;
		short s = 123;
		int i = 12345;
		long l = 2147483648l;
				
		// 기본 자료형 : 실수형
		float f = 123.456f;
		double d = 12345.678; 
		
		// 기본 자료형 : boolean
		boolean boo1;
		boo1 = s > i;
		
		// 기본 자료형 : char
		char cc = 'A';
		cc = '김';
		
		// String 과 비교
		String ss = "A";
		
		// 값을 할당 후 출력
		b = 100;
		System.out.println("byte b =>" + b);
		System.out.println("boo1ean =>" + boo1);
		
		// 최대값과 최소값 출력
		System.out.println("byte Max =>" + Byte.MAX_VALUE);
		System.out.println("byte Min =>" + Byte.MIN_VALUE);
		
		System.out.printf("short : %d, MAX = %d, MIN = %d \n", s, Short.MAX_VALUE, Short.MIN_VALUE);
		System.out.printf("int : %d, MAX = %d, MIN = %d \n", i, Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.printf("long : %d, MAX = %d, MIN = %d \n", l, Long.MAX_VALUE, Long.MIN_VALUE);
		
		System.out.printf("float : %f, MAX = %f, MIN = %f \n", f, Float.MAX_VALUE, Float.MIN_VALUE);
		System.out.printf("double : %f, MAX = %f, MIN = %f \n", d, Double.MAX_VALUE, Double.MIN_VALUE);
		
		System.out.printf("char : %s, String : %s \n", cc, ss);
	}
}