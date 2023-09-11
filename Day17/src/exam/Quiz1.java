package exam;

import java.util.Scanner;

public class Quiz1 {
    /*
    영문을 입력받아 엔터를 입력하면 입력한 영문을, 소문자는 대문자로
    대문자는 소문자로 변경하여 출력하는 프로그램을 작성하세요.
    단, 사용자가 END, end라는 문자열을 입력받으면 프로그램 종료

    <실행결과>
    입력 >> >> dfesDED
    대소문자 변환 : DFESded
    입력 >>end
    프로그램종료!!
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true) {
            String result ="";
            System.out.print("입력 >> ");
            String input = sc.nextLine();

         if(input.equals("end") || input.equals("END")) {
             System.out.println("프로그램 종료!!");
             break;

         } else {
             for(int i = 0; i < input.length(); i++) { //input 글자수 반복 실행
                 char c = input.charAt(i); //c에다가 n번째 글자 대입

                 if (Character.isLowerCase(c)) { //만약 소문자면
                     result = result + Character.toUpperCase(c); //대문자로 변경 한 값을 result에 추가
                 } else {
                     result = result + Character.toLowerCase(c); //소문자로 변경 후 추가
                 }

             }

         }
            System.out.println("대소문자 변환 : " + result );
        }

    }
}
