public class ForExContBreak {
	public static void main(String[] args) {
		banana: // labled
		System.out.println("");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 11; j++) {
				if (i == 4 && j == 4) break banana; 
				System.out.printf("[%d, %d] ", i, j);
			}
			System.out.println("");
		}
	}
}