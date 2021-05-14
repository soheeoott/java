public class WhileEx {
	public static void main(String[] args) {
		// while
		int minus = 0;
		int count = 0;
		while (minus < 10) { // 10Kg 줄어들 때 까지
			System.out.println(" minus : " + minus++);
			count++;
		}
		System.out.println("while 총 반복 횟수 : " + count);
		
		// do ~ while
		minus = 0;
		count = 0;
		do {
			System.out.println(" minus : " + minus++);
			count++;
		} while (minus < 10);
		System.out.println("do while 총 반복 횟수 : " + count);
	}
}