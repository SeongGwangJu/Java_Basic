package ex03;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		/*
		 * 문제1)
		 * 캘리포니아에 사는 친척한테 오렌지를 6350개를 받았다
		 * 그런데 오렌지가 너무 많아서 주위사람들한테 나눠주려고 한다.
		 * 오렌지를 한 사람당 52개씩 박스에 담아서 나눠주려고 하는데, 필요한 박수의 개수를 구하세요(나머지는 제외)
		 */
		System.out.printf("필요한 박수의 갯수 : %d\n", 6350/52);
		
		/* 문제2)
		 * 사용자로부터 숫자를 입력받아 2자리의 정수(10~99)사이를 입력받고
		 * 십의자리와 일의자리 숫자를 각각 출력하세요
		 * 입력 >>98
		 * 십의자리 : 9
		 * 일의자리 : 8
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자를 입력하세요(10~100) : ");
		int num = sc.nextInt();
		
		if(num >= 10) {
			if(num <= 100) {
				int num10 = num / 10;
				int num1 = num - (num/10)*10;
				
				System.out.println("십의자리 : " + num10);
				System.out.println("일의자리 : "+ num1);

			} else {
				System.out.println("100 이하의 정수를 입력하세요");
			}
			System.out.println("");
		} else {
			System.out.println("10 이상의 정수를 입력하세요");
		}
		
		
		
		
		
		
		
	}
	

}
