package ex02;

import java.util.Scanner;

public class Example_15 {

	public static void main(String[] args) {
		/*
		 * Scanner() : 사용자가 데이터를 입력받을 때 사용하는 클래스
		 * 형식 
		 * Scanner Scanner = new Scanner(System.in)
		 * 
		 * 종류
		 * Scanner.nextByte() : byte형 입력 및 리턴
		 * Scanner.nextShort() : short형 입력 및 리턴
		 * Scanner.nextInt(); : int형 입력 및 리턴
		 * Scanner.nextLong() : long형 입력 및 리턴
		 * 
		 * Scanner.nextFloat() : float형 입력 및 리턴
		 * Scanner.nextDouble() : double형 입력 및 리턴
		 * 
		 * Scanner.next() : String형 입력 및 리턴(공백을 기준으로 단어 하나를 읽어들임)
		 * Scnner.nextLine() : String형 입력 및 리턴(개행을 기준으로 한 줄을 읽어들임)
		 */
		Scanner sc = new Scanner(System.in); //in = input. 이걸쓰면 컨트롤 창에서 입력을 받을 수 있다
		System.out.println("숫자를 입력하세요>>");
		int num = sc.nextInt();
		System.out.println(num*10);
	}

}
