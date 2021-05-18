import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		Random rn = new Random();
		int rno = rn.nextInt(10) + 1;
		
		Scanner sn = new Scanner(System.in);
		int mno = 0;
		int count = 0;
		
		while (true) {
			// (1) 당첨이면 종료
			System.out.println(count + " 회차 1~10번 사이의 숫자를 입력 : ");
			mno = sn.nextInt();
			if (mno == rno) {
				System.out.print(count + " 회차 당첨! 축하드립니다.");
				sn.close();
				break;
			}
			count = count + 1;
			
			// (2) 같으면 금메달(당첨), 차이가 1이면 은메달, 차이가 2이면 동메달, 아니면 꽝
			System.out.println(++count + " 회차 : 1~10번 사이의 숫자를 입력 : ");
			mno = sn.nextInt();
			if (rno == mno) {
				System.out.println("금메달 당첨");
				break;
			} 
			else if (Math.abs(rno-mno)==1)
				System.out.println("은메달 당첨");
			else if (Math.abs(rno-mno)==2)
				System.out.println("동메달 당첨");
			else 
				System.out.println("꽝");
		}
		System.out.println("당첨 번호 : " + rno);
		sn.close();
		}
	}
}