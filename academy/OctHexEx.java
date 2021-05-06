// 8진수, 16진수 표기
public class OctHexEx01 {
	public static void main(String[] args) {
		int binary = 0b1111;
        int oct = 017;
        int dec = 15;
        int hex = 0xf;

        System.out.println("binary : " + binary);
        System.out.println("oct : " + oct);
        System.out.println("dec : " + dec);
        System.out.println("hex : " + hex);
        System.out.println("");

        // 2, 8, 16 진수로 변환
        System.out.println("2진수 : " + Integer.toBinaryString(binary));
        System.out.println("8진수 : " + Integer.toOctalString(oct));
        System.out.println("16진수 : " + Integer.toHexString(hex));
        System.out.println("");

        // String to Integer
        String si = "12345";
        System.out.println("dec + si : " + (dec + Integer.parseInt(si)));
	}
}