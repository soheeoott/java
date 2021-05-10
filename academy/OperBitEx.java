public class Oper02 {
	public static void main(String[] args) {
		//이진연산 - bit 연산
		int x = 10; // 1 0 1 0  
		int y = 3;  // 0 0 1 1
		
		// and(&), OR(|), XOR(^)
		System.out.println("x&y => "+(x&y));
		System.out.println("x|y => "+(x|y));
		System.out.println("x^y => "+(x^y));
		
		// >>, <<
		System.out.println("x>>y => "+(x>>y));
		System.out.println("x>>1 => "+(x>>1));
		System.out.println("x<<y => "+(x<<y));
		System.out.println("x<<1 => "+(x<<1));
	}
}