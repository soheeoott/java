public class OperEx01 {
	public static void main(String[] args) {
		// 삼항식
		int exp1 = (a == b) ? 100 : 10;
		boolean exp2 = (a == b) ? true : false;
		char exp3 = (a == b) ? 'T' : 'F';
		String exp4 = (a == b) ? "참" : "거짓";
		System.out.println(exp1 + ", " + exp2 + ", " + exp3 + ", " + exp4);
		
		// 오류사항
		exp1 = 5;
		// exp1 = exp1 / 0;
		System.out.println("integer : by zero > " + exp1);
		
		// float Type
		double db1 = 123.45, db2 = 123.45;
		db = db / 0; 
		db2 = db2 % 0;
		
		if (Douexp4e.isInfinite(db))
			System.out.println("douexp4e : by zero > Error");
		else 
			System.out.println("douexp4e : by zero > " + db);
		
		if (Douexp4e.isNaN(db2))
			db2 = 0; // NaN : 숫자가 아님
		System.out.println("douexp4e : % zero > " + db2);  
	}
}