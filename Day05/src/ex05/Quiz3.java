package ex05;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * 초등학교에서 중간고사 시험을 보았다
		 * 시험 성적이 70점 이상이면 합격, 70점 미만이면 불합격을 출력하고
		 * 점수가 0미만 100점을 초과시
		 * "입력범위를 초과하였습니다." 라는 문구를 출력하세요!!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사 성적을 입력하세요 >>");
		int score = sc.nextInt();
		
		if(score >= 70 && score <= 100) {
		  System.out.println("합격");
		} else if(score < 70 && score >= 0) {
			System.out.println("불합격");
		} else if(score > 100 || score < 0) {
			System.out.println("입력범위를 초과하였습니다");
			
		}
		System.out.println("======강사님풀이======");
		//제한조건을 먼저 언급한다!
		if(score < 0 || score > 100) {
			System.out.println("입력범위를 초과하였습니다");
		} else if(score >= 70) {
			System.out.println("합격");
		} else if(score <70 ) {
			System.out.println("불합격");
		}
		}
	}


