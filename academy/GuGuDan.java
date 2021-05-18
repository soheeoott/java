public class GuGuDan {
	public static void main(String[] args) {
		int i, j;
		// 가로
		for(i = 1; i < 10; i++) {
			for(j = 2; j < 10; j ++) {
				System.out.printf("%d * %d = %d", i, j, (i * j));
			}
			System.out.println("");
		}
		System.out.println("");
		
		// 세로
		for(i = 1; i < 10; i++) {
			for(j = 2; j < 10; j ++) {
				System.out.printf("%d * %d = %d", j, i, (i * j));
			}
			System.out.println("");
		}
	}
}