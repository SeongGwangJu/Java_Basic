package exam;

import java.util.HashMap;
import java.util.Scanner;

public class Example_07 {
    public static void main(String[] args) {
        /*
        Map
         - Key(키), Value(값)으로 구분하여 데이터를 저장하는 방식
         - Map의 구현 클래스로는 HashMap, LinkedHashMap, HashTable
         - key값은 중복이 불가능. value 값은 중복이 가능
         - HashMap은 데이터의 순서가 보장되지 않는다.
         - HashMap의 순서를 보장하고 싶은경우 LinkedHashMap을 활용하면 됨
         */

        HashMap<String, String> dic = new HashMap<String, String>();

        //dic에 저장
        dic.put("apple", "사과"); //key : apple | value값 : apple
        dic.put("banana", "바나나"); //key : banana | value값 : 바나나
        dic.put("grape", "포도"); //key : grape | value값 : 포도

        //사용자로부터 영어 단어를 입력받고 한글 단어 검색 "exit"를 입력받으면 종료
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("영어 단어 입력 >> ");
            String find_word = scanner.nextLine();

            if(find_word.equals("exit") || find_word.equals("EXIT")) {
                System.out.println("Program Exit");
                break;
            }
            // 입력받은 값이 map에 없으면 null을 리턴
            String word = dic.get(find_word);
            if (word == null) {
                System.out.println(find_word + "는 없는 단어입니다.");
            } else {
                System.out.println(word);
            }
        }


    }
}
