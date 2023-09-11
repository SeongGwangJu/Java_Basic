package ex06;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 입력받은 수 까지의 합계를 구하세요
		 * 
		 * 예를들어
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("합계는 : " + sum);
		
		num = sc.nextInt();
		sum = 0;
		int j = 1;
		while(j <= num) {
			j++;
			sum += j;
			
		}
		System.out.println(sum);
		
	}
}
