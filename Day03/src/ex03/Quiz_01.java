package ex03;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		/* 문제
		 * 국어점수 85점
		 * 수학점수 85점
		 * 영어점수 75점
		 * 국사점수 88점
		 * 네 과목의 합계(정수)와 평균(실수)를 출력하세요!!
		 */
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("국어점수를 입력하세요 >> ");
		float kor = sc.nextFloat();
		System.out.println("수학점수를 입력하세요 >> ");
		float mat = sc.nextFloat();
		System.out.println("영어점수를 입력하세요 >> ");
		float eng = sc.nextFloat();
		System.out.println("국사점수를 입력하세요 >> ");
		float his = sc.nextFloat();
		
		
		System.out.println("네 과목의 합계");
		float sum = kor + mat + eng + his;
		int sumvar = (int) sum;
		System.out.println(sumvar);
		
		double avg = sum / 4;
		System.out.println("네 과목의 평균");
		System.out.println(avg);
	}

}
