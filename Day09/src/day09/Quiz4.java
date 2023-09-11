package day09;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		/*
		 * 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고,
		 * 1번째 피보나치 수는 
		 * 그다음 2번째 바로 앞 두 피보나치 수의 합이 된다.
		 * 이를 식으로 써보면 Fn = F(n-1) +F(n-2) (n>=2)가 된다.
		 * n=10일때까지 피보나치 수를 써보면 다음과 같다.
		 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		 * 
		 * 숫자 n을 입력받아 피보나치 수열을 구하는 프로그램을 작성하세요
		 */
		//굳이 배열을 쓰지않아도 만들 수 있지 않나? 소수 구하기 프로그램 만들 때 피보나치 수열 얘기했었는데...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		
		int n = sc.nextInt();
		
		int fibo[] = new int[n];
		fibo[0] = 1;
		fibo[1] = 1;
		
		//System.out.printf("%d %d ", fibo[0], fibo[1]); //for밖에다가 맨 처음 두 수를 넣을경우
		for(int i = 2; i<n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
			if(i==2) {
				System.out.print("\n" + fibo[i-2] + " ");
				System.out.print(fibo[i-1] + " ");
			}
			System.out.printf("%d ", fibo[i]);
			
		}
	}

}
