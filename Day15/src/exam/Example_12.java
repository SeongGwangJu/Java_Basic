package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_12 { 
	//다중 예외처리 : catch가 여러개
	public static void main(String[] args) {
		
		
		try {
			Scanner sc = new Scanner(System.in);
		
		int[] cards = {4,5,1,2,7,8};
		System.out.println("몇 번째 카드를 뽑으시겠습니까(0~5 입력) >> ");
		
		int cardsIndex = sc.nextInt();
		System.out.println("뽑은 카드 번호는 : " + cards[cardsIndex]);
		} catch(InputMismatchException e) {
			System.out.println("문자만 입력해라");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0~5까지만 입력해라");
		}
	
	}
}