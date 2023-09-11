package exam;

import java.util.Scanner;

public class Example_13 {
	
	/*
	 * finally
	 * -예외 발생 유무와 상관없이 실행되는 구문이며 생략할 수 있다.
	 * -예외 처리를 할 때 예외와 상관없이 반드시 처리해야 하는 구문들을 작성할 때 사용됨
	 * 
	 * 형식)
	 * try {
	 * 
	 * } catch() {
	 * 
	 * } finally {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수입력 : ");
			int score = sc.nextInt();
			if(score >=65 ) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} catch(Exception e) {
			System.out.println("잘못입력");
		}	finally {
			System.out.println("프로그램 종료");
		}
	}
}
