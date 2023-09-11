package quiz;

import java.util.Scanner;

public class GradeMain {
	/*
	 * Grade 클래스를 작성하세요
	 * 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적과 평균을 출력하는 main()과
	 * 실행예시는 아래와 같다
	 * 
	 * 수학, 과학, 영어 순으로 3개 점수 입력 >> 90 88 96
	 * 평균은 91
	 * 
	 */
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scanner.nextInt();
		int sci = scanner.nextInt();
		int eng = scanner.nextInt();
		
		Grade grade = new Grade(math, sci, eng);
		
		grade.main();
		System.out.println("평균은 : " + grade.average()) ;
	}

}
