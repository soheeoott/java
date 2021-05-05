public class OverflowEx {
	public static void main(String[] args) {
		short min = -32768;
		short max = 32767;
		System.out.println("min =" + min);
		System.out.println("min-1 =" + (short)(min-1));
		System.out.println("max =" + max);
		System.out.println("max+1 =" + (short)(max+1));
		
		int i,j;
		i = 100;
		j = 0;
		System.out.println("정수를 0으로 나누기 =" + (i/j)); // Runtime Error : ArithmeticException
		
		double d1,d2,d3;
		d1 = 1.0000000000000001;
		d2 = 1.0000000000000001;
		d3 = d1 + d2;
		System.out.println("double =" + d3);
		
		int i = 10;
		System.out.println("double ="+(i/0)); // ArithmeticException : by zero
		
		d1 = 100;
		System.out.println("double(/0) =" + (d1/0)); // Infinity
		System.out.println("double(%0) =" + (d1%0)); // NaN
	}
}