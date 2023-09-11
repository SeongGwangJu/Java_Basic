package day09;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		/*
		 * 키보드를 통해 학생 수와 각 학생들의 점수를 입력받고
		 * 최고점수 최소점수 및 평균점수를 출력하는 프로그램
		 */
		Scanner sc = new Scanner(System.in);
		int studentNumber = 0;
		int student[] = null;
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수확인|4.분석|5.종료");
			System.out.println("------------------------");
			System.out.println("메뉴선택 >> ");
			
			int menu = sc.nextInt(); // 메뉴선택
			
			if(menu==1) {
				System.out.println("학생수 입력");
				studentNumber = sc.nextInt();
				student = new int[studentNumber];
				
			} else if(menu==2) {
				System.out.println("[ 학생들의 점수 입력 ]");
				for(int i = 0; i <student.length; i++) {
					System.out.println((i+1) + " 번 학생의 점수 입력 >> ");
					student[i] = sc.nextInt();
				}
				
			} else if(menu==3) {
				System.out.println( "[학생들의 점수 확인 ]");
				for(int i =0; i<student.length; i++) {
					System.out.println((i+1)+ "번 학생점수 : " + student[i]);
				}
				
			} else if(menu==4) {
				System.out.println("[학생들의 점수 분석]");
				int sum = 0;
				int max = 0;
				int maxStudentNum = 0;
				int min = 999;
				int minStudentNum = 0;
				for(int i = 0; i<student.length; i++) {
					if(student[i] > max) {
						max = student[i];
						maxStudentNum = (i+1);
					}
					if(student[i] < min) {
						min = student[i];
						minStudentNum = (i+1);
					}
					sum = sum + student[i];
				}
				double avg = sum / (double)student.length;
				
				System.out.println("학생 수는 " + studentNumber + "명으로");
				System.out.println("최고점수는 " + max + "점으로 " + (maxStudentNum) + "번학생 입니다.");
				System.out.println("최저점수는 " + min + "점으로 " + (minStudentNum) + "번학생 입니다.");
				System.out.println("평균은 " + avg + "점입니다.");
				
			} else if(menu==5) {
				System.out.println("프로그램 종료!!");
				System.exit(0);
			}
			
		}
	}

}
