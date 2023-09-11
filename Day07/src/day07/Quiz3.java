package day07;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		/* 
		 * 두 수를 입력받아 두 수의 공약수를 구하고
		 * 두 수의 최대공약수를 구하세요!!\
		 * 
		 * 공약수 : 두 수의 공통인 약수
		 * 최대공약수 : 공약수 중 가장 큰 수 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 >>");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력 >>");
		int num2 = sc.nextInt();
		int max = 0; //최대공약수
		
			for (int i=1; i<=num1; i++) {
					if (num1%i ==0 && num2%i==0) {
					System.out.println("공약수 : " + i);
					max = i;
					}
			}
		System.out.println("최대공약수 : " + max);
	} //개노가다로 풀기는 했지만 중첩반복문 사용하지 않아도 됨! 어차피 i==j 조건이 들어가있으니, for문 한개만 사용해도 됨.
	
}


