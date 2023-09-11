package ex05;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		/*
		 * 자신의 몸무게와 키를 입력받고
		 * BMI가 저체중인지, 정상인지, 과체중인지, 비마인지 판별하는 프로그램을 작성하세요
		 * <조건>
		 * BMI가 18.5이면 저체중
		 * BMI가 18.5 ~22.9 사이면 정상
		 * BMI가 23.0 ~ 24.9 사이면 과체중
		 * BMI가 25.0 이상부터는 비만
		 * BMI 공식) 몸무게(KG) / 신장(m)*신장(m)
		 * 
		 * 몸무게와 키는 실수타입으로 입력받도록 하고
		 * cm => m 변환하는 법
		 * 1cm = (1/100)
		 * 875.5cm = 875.5 / 100 = 8.755m
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키(cm)를 입력하세요");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력하세요");
		double weight = sc.nextDouble();
		
		double m = height/100;
		double bmi = weight /(m*m);
		System.out.printf("당신의 bmi는 : " + bmi + "\n");
		System.out.println("=== bmi 판별결과 ===");
		
		if( bmi > 25) {
			System.out.println("비만입니다 살빼세요");
		} else if( bmi < 18.5) {
			System.out.println("저체중입니다");
		} else if( bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중입니다");
		} else if( bmi >= 23) {
			System.out.println("과체중입니다");
		}
		
	}

}
