package day08;

import java.util.Scanner;

public class Example_07 {

	public static void main(String[] args) {
		/*
		 * 길이가 5인 배열을 입력받아 인덱스가 3번인 곳은 출력하지 말고 나머지만 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i +"번방 값 입력 > ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != arr[3]) {
				System.out.println(arr[i]);
			} else {}
			
		}
		 //강사님 풀이
		 for(int j = 0; j<arr.length; j++) {
			if(j == 3) {
				continue;
			}
		 System.out.println(arr[j]);
		}
	}
}
