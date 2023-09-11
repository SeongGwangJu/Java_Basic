package exam;

import java.util.ArrayList;
import java.util.List;

public class Example_03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //삽입
        list.add("사과");
        list.add("딸기");
        list.add("바나나");
        System.out.println(list);

        list.add("포도"); //list 뒤에 삽입
        list.add("체리");
        System.out.println(list);

        /*
        데이터 삽입을 원하는 위치에 기존 데이터가 존재하면
        기존 데이터는 뒤로 이동하고 새로운 데이터가 그 자리에 삽입됨
         */
        list.add(2, "망고"); // [2]위치에, "망고"삽입
        list.add(3, "수박"); // [3]
        System.out.println(list);

        //값 변경
        list.set(4, "파인애플"); //[4]위치 (5번째)에거 버리고 교체
        System.out.println(list);

        //값 삭제
        list.remove(1); //[1]위치 삭제 (딸기)
        System.out.println(list);
        list.remove("파인애플"); //"파인애플"찾아서 삭제
        System.out.println(list);
        // 배열처럼 데이터만 삭제되는게 아니라
        // 값이 있던 공간까지 삭제하고 뒤의 데이터가 앞으로 이동

        //삭제하는 값이 여러개라면 제일 처음 위치한 걸 삭제함
        list.add("망고");
        System.out.println(list); //중복된 값 확인
        list.remove("망고");
        System.out.println(list);

        //리스트 안에 있는 값들을 전부 삭제
        list.clear();
        System.out.println(list);
    }
}
