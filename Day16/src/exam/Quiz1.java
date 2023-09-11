package exam;

import java.util.Scanner;

public class Quiz1 {
    /*
    Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇개
    "그만"을 입력할 때까지 반복하는 프로그램을 작성하세요

    입력 >> I love Java
    어절개수 3
    입력 >> 자바는 객체 지향 언어로써 매우 좋은 언어이다
    어절개수 7
    입력 >> 그만
    종료합니다...
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("입력 >> ");
            String str = scanner.nextLine();

            if(str.equals("그만")) {
                System.out.println("종료합니다..");
                break;
            }

            String[] words = str.split(" ");

            for(String x : words) {
                System.out.println(x);
            }
            System.out.println("어절개수 " + words.length);
        }

    }
}
