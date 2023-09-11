package ex06;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/* 
		 * 숫자를 '계속' 입력받아
		 * 입력받은 숫자들의 총 합을 구하세요
		 * 0을 입력하면 "프로그램 종료"라는 메시지를 띄우고
		 * 프로그램을 중지시키면 됨!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 1;
		int num = 0;
		
		while(true) {
			System.out.println("입력 >> ");
			num = sc.nextInt();
			i++;
			sum = sum + i;
		}
		System.out.println("입력받은 수의 총합 : " + sum);

		
			
		
		
	}

}
