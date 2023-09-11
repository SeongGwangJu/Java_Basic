package Day04;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {
		/*
		 * 합격 불합격 판별
		 * 입력받은 숫자가 70점 이상이면 합격
		 * 그렇지 않으면 불합격
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력 >>");
		
		int num = sc.nextInt();
		String result = (num >=70) ? "합격\n" : "불합격\n";
		System.out.println(result);
		
		if(num >= 70) {
			System.out.println("합격2");
		} else {
			System.out.println("불합격2");
	}
	}
}
