public class CastingEx {
	public static void main(String[] args) {
		double d = 123.45;
		int i = 123;
		d = i;
		System.out.println("promotion d 의 값 =>"+d);
		System.out.println("promotion i 의 값 =>"+i);
		
		char c = 'B';
		int n1 = c+1;
		
		c = (char)n1;
		System.out.printf("char n1 의 값 => %d, char > %s \n", (int)c, c);
		float f = 123.45f;
		int n2 = 0;
		n2 =(int)f;
		System.out.println("int f 의 값 =>"+n2);
		
		short s1 = 10, s2 = 20, s3 = 0;
		int sum = 0;
		sum = s1 + s2;
		s3 = (short)(s1 + s2);
	}
}