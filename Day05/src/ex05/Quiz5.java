package ex05;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		/*
		 * 연산기호에 따라(덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/) 사칙연산을 하는 프로그램을 작성하세요
		 * 숫자는 int형으로 입력받으세요
		 * 
		 * 숫자입력 >> 3
		 * 기호입력 >> +
		 * 숫자입력 >> 3
		 * 결과 : 6
		 * 
		 * 숫자입력 >> 10
		 * 기호입력 >> %
		 * 숫자입력 >> 20
		 * 
		 * char형 입력방법
		 * char 변수명 = scanner.next().char.At(0)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("기호입력 >> ");
		char fn = sc.next().charAt(0);
		System.out.print("숫자입력 >> ");
		int num2 = sc.nextInt();
		
		int plus = num1 + num2;
		int minus = num1 - num2;
		int times = num1*num2;
		int divide = num1/num2;
		
		if(fn == '+') {
			System.out.println("연산결과 : " + plus);
		} else if(fn == '-') {
			System.out.println("연산결과 : " + minus);
		} else if(fn == '*') {
			System.out.println("연산결과 : " + times);
		} else if(fn == '-') {
			System.out.println("연산결과 : " + divide);
		} else {
			System.out.println("기호를 잘못 입력하셨습니다");
		}
		
//다른버전
		System.out.println("==============");
		if(fn == '+') {
			System.out.println("결과 : " + (num1+num2));
		} else if(fn == '-') {
			System.out.println("결과 : " + (num1 - num2));
		} else if(fn == '*') {
			System.out.println("결과 : " + (num1*num2));
		} else if(fn == '-') {
			System.out.println("결과 : " + (num1/num2));
		} else {
			System.out.println("기호를 잘못 입력하셨습니다");
		}
		
//다른버전
		System.out.println("==============");
		if(fn != '+' && fn!='-' && fn!='*' && fn!='/') {
			System.out.println("기호를 잘못 입력하셨습니다");
		} else if(fn == '+') {
			System.out.println(plus);
		} else if(fn =='-') {
			System.out.println(minus); 
		} else if(fn == '*') {
			System.out.println(times);
		} else if(fn == '/') {
			System.out.println(divide);
		}
		
		
		
		
		}
	}

