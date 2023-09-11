package ex03;

import javax.naming.spi.DirStateFactory.Result;

public class Example_08 {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * -산술 연산자는 사칙연산자와 나머지 연산자가 있다
		 * 일반적으로 정수, 실수 등 숫자를 연산할 때 사용
		 * 
		 * 피연산자의 자료형이 일치하지 않을경우 크기가 큰 자료형으로 자동 형 변환이 일어난 후 연산실행
		 * 연산의 결과값이 자료형의 범위 안에 있어야 하고 만약 범위 밖으로 값이 넘어가면 오버플로우 혹은 쓰레기값이 출력
		 */
		int x = 100;
		int y = 200;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y + "\n");
		
		//자동 형 변환
		double num1 = 1.2345;
		int num2 = 6;
		System.out.println(num1 + num2 + "\n");
		
		//자료형 범위를 넘어 오버플로우 혹은 쓰레기 값 출력
		int result= 100000 * 1000000;
		System.out.println(result);
		
		//제대로 출력되려면 long으로 변경
		long result2 = 1000000l * 1000000l;
		System.out.println(result2+ "\n"); 
		
		float f1 = 10e30f;
		System.out.println(f1);
		
		float result3 = 10e30f * 9e30f;
		double result4 = 10e30 * 9e30;
		System.out.println(result3);
		System.out.println(result4);
		
		double d1 = 3.4e38;
		double d2 = 10e30;
		if (d1>d2) {
			System.out.println(d1);
		} else {
			System.out.println(d2);
		}
		}
}
