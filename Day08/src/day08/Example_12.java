package day08;

import java.util.Scanner;

public class Example_12 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열은 행만 지정하고 열을 지정하지 않고 선언 가능
		 * 2차원 배열을 생성할 때 열을 지정하지 않고 행마다 다른 길이의 배열을 저장할 수 있다
		 */
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][];
		
		arr[0] = new int[3]; // 첫번째 행에 열 3개
		arr[1] = new int[2]; // 두번째 행에 열 2개
		arr[2] = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print((i+1) +"번째 행 " + (j+1) + "번째 열의 값 입력 >> ");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("입력 끝, 값을 출력해봅시다");
		
		for(int i =0; i<arr.length; i++) {
			int[] inArr = arr[i];
			for(int j = 0; j<inArr.length; j++) {
				System.out.print(inArr[j] + " ");
			}
			System.out.println();
		}
	}	
}
		
