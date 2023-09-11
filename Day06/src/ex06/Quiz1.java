package ex06;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * 수를 입력받아 그 수의 구구단을 출력하세요
		 * 
		 * 입력 >> 5
		 * 출력) 5 x 1 = 5
		 * 5 x 2 = 10
		 * ....
		 * 5 x 9 = 45
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9사이의 수를 입력하세요 : ");
		int input = sc.nextInt();
		System.out.println("======");
		if(input <= 9 && input > 0) {
			for(int i = 1; i <=9; i++ ) {
				System.out.println(+input + " x " + i + " = " + input*i);
			}
		} else {
			System.out.println("1부터 9사이의 수를 입력하세요");
		}
		
	}

}
