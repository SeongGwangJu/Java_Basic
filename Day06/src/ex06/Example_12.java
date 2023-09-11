package ex06;

public class Example_12 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		int coffee = 10;
		while(true) {
			System.out.println("돈을 받았으니 커피를 준다");
			coffee--;

			if (coffee == 2) {
				break; // 루프를 종료하기 위해 break 문 사용
		}
		System.out.println("남은 커피의 양은 " + coffee + "입니다.");
		
		
		if(coffee ==2) {
			System.out.println();
		}
		
	}
	}
}
