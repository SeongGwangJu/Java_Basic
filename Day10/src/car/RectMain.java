package car;

import java.util.Scanner;

public class RectMain {

	public static void main(String[] args) {
		/*
		 * Rectangle 클래스를 생성하여 가로와 세로를 필드로 선언 후 사각형의 넓이를 구하세요!
		 * 가로 * 세로 !!
		 */
		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 넓이 입력 >>");
		rect.width = sc.nextInt();
		System.out.println("세로 넓이 입력 >>");
		rect.length = sc.nextInt();
		
		int area = rect.getArea();
		System.out.println("넓이는 " + area);
		System.out.println("넓이는(ver.2) " + rect.getArea());
	}

}
