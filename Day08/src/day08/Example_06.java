package day08;

import java.util.Scanner;

public class Example_06 {

	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 배열 안에 모든 값의 총합과 평균을 구하세요 !!
		 * 1번째 요소 입력 >>
		 * 50
		 * 2번째 요소 입력 >>
		 * 24
		 * 3번째 요소 입력 >>
		 * 30
		 * 4번째 요소 입력 >>
		 * 22
		 * 5번째 요소 입력 >>
		 * 21
		 * 총합 : 147 평균 : 29.4
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; //길이가 5인 배열 선언
		
		//각 인덱스에 들려서 해당 값을 넣음
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 요소 입력 >>");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int j = 0; j <arr.length; j++) {
			sum = sum + arr[j]; //해당 인덱스의 값들을 모두 더하는 코드
		}
		
		double avg = sum / (double) arr.length;
		System.out.println("총합 : " + sum + " 평균 : " + avg);
	}

}
;