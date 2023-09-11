package ex02;

public class example_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수형(byte, short, int, long)
		 * 
		 * 크기순으로 나열
		 * byte -> short -> int -> long)
		 *=(1byte) =(2byte) =(4byte) =(8byte)
		 * byte : -128 ~ 127
		 * short : -32768 ~ 32767
		 * int : -2147483648 ~ 2147483647
		 * long : -9223372036854775808 ~ 9223372036854775807
		 */
		
		byte num1 = 20;
		//byte num2 = 128; 저장할 수 있는 숫자의 범위를 벗어났으므로 에러
		//byte num3 = -129;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		System.out.println(num1); System.out.println(num2);
		System.out.println(num3); System.out.println(num4);
		
		System.out.println("==================");
		
		// 정수형에는 2진수, 8진수, 16진수도 표현 가능하다
		// 출력은 전부 10진수로 출력됨
		byte num5 = 0110;
		short num6 = 0107;
		int num7 = 0x46;
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
		//long 타입의 큰 정수를 표현하고자 하면(int형 범위를 벗어났을 시)
		//숫자 뒤에 소문자l이나 대문자L을 반드시 붙혀야한다!
		/*
		 * long num8 = 100000000000; ->출력오류발생
		 */
		long num8 = 100000000000L; 
		System.out.println(num8);
		
		
		
	}

}
