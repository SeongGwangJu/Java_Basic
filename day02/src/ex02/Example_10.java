package ex02;

public class Example_10 {

	public static void main(String[] args) {
		/*
		 * 형 변환
		 * - 자료형을 다른 자료형으로 변환하는 것
		 * - 연산을 하기 위해서는 같은 자료형끼리만 수행 가능
		 * - 따라서, 서로 다른 자료형의 연산을 수행하기 위해서는 같은 자료형으로 변환해야한다.
		 * - 변환 방법 : 변수 앞에 (바꿀 자료명) 추가
		 * 
		 */
		int num1 = 11;
		double num2 = 3.14;
		
		double result = (double) num1 + num2; //(double)값을 붙여 int형인 num1을 double형으로 전환
		int result1 = num1+ (int)num2; //(int)값을 붙여 double형인 num2를 int형으로 전환
		System.out.println("덧셈 결과 : " + result); //double이라서 실수로 출력
		System.out.println("덧셈 결과 : " + result1); // int라서 정수로 출력
		
		
	}

}
