package day09;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * 숫자 한개를 입력받아 입력받은 수 만큼 배열 크기를 지정하여
		 * 3의 배수를 저장하는 배열을 만들고 출력하세요!
		 * 출력 예)
		 * 5를 입력받으면
		 * 3	6	9	12	15
		 * 9를 입력받으면
		 * 3	6	9	12	15	18	21	24	27
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >> ");
		int n = sc.nextInt();
		
		int[] arr = new int [n];
		
		for(int i = 0; i <arr.length; i++) {
			arr [i] = (int) 3*(i+1);
			System.out.printf("%d \t ", arr[i]);
		}

	}
}
