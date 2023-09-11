package ex03;

import java.util.Scanner;

public class Example_01 {
		//공백을 기준으로 단어 하나를 읽어들임
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열입력>>");
		String str = sc.nextLine();
		
		System.out.println(str);
	}

}
