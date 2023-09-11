package day08;

import java.util.Scanner;

public class Example_04 {

	public static void main(String[] args) {
		//배열 입력 받기
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[4];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 입력");
			arr[i] = sc.nextInt();
		}
		System.out.println("입력한 값을 출력합니다");
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
