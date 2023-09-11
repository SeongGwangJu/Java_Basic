package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_11 {
//Exception e : 모든 에러를 다 처리해준다.
	public static void main(String[] args) {
		
	
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		if(score >=65) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다");
			}
	} catch(Exception e) {  //Exception만 치면 모든 에러를 다 처리해준다
		System.out.println("숫자만 입력 해라");
		
	}
	}
}
