package exam;

import java.util.HashMap;
import java.util.Hashtable;

public class Example_09 {
    public static void main(String[] args) {
        /*
        HashMap, Hashtable
         -HashMap : 단일 스레드 환경에서 사용하기 좋은 자료구조
         -Hashtable : 멀티스레드 환경에서 사용하기 좋은 자료구조
         */

        //HashMap에는 null값이 올 수 있다.
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("apple", "사과");
        map1.put("banana", "바나나");
        map1.put("grape", "포도");
        map1.put(null, "오렌지");
        map1.put("coffee", null);
        System.out.println(map1);

        //Hashtable에는 null 키나 값이 올 수 없다.
        Hashtable<String, String> map2 = new Hashtable<String, String>();
        map2.put("apple", "사과");
        map2.put("banana", "바나나");
        map2.put("grape", "포도");
        //map2.put(null, "오렌지"); //Hashtable에는 null값이 올 수 없다.
        //map2.put("coffee", null);
        System.out.println(map2);


    }
}
