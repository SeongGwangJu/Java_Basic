package ex03;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		/*
		 * 자신의 나이, 이름, 학교, 거주지를 입력받아
		 * 출력하는 프로그램을 작성하세요
		 * 
		 */
		Scanner sc = new Scanner(System.in); 
		System.out.println("자신의 나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		System.out.println("자신의 이름을 입력하세요 >> ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("자신의 학교를 입력하세요 >> ");
		String sch = sc.nextLine();
		
		System.out.println("자신의 거주지를 입력하세요 >> ");
		String addr = sc.nextLine();
		
		System.out.println("저의 나이는 " + age + "살이고, 이름은 " + name + ", 학교는 " + sch +"이며, " + addr + "에 살고 있습니다.");
		System.out.printf("저의 나이는 %d살이고, 이름은 %s, 학교는 %s이며, %s에 살고 있습니다.",age,name,sch,addr);
	}

}
