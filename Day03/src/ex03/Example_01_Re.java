package ex03;

import java.util.Scanner;

public class Example_01_Re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 지역, 체중, 주소(상세히)을 '빈칸으로'구분하여 순서대로 입력 >>");
		String name = sc.next();
		int age = sc.nextInt();
		String city = sc.next();
		double weight = sc.nextDouble();
		String address = sc.nextLine(); //nextLine은 반드시 엔터로 구분한다!
		
		
		System.out.printf("내 이름은 %s, 지역은 %s, 나이는 %d, 체중은 %.1fkg, 주소는 %s",
				name, city, age, weight, address);
	}

}
