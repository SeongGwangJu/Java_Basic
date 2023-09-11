package exam;

import java.util.HashMap;

public class Example_08 {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<String, Integer> ();

        //5개의 점수 저장
        scoreMap.put("홍길동", 97);
        scoreMap.put("홍길순", 88);
        scoreMap.put("홍길영", 89);
        scoreMap.put("김길동", 70);
        scoreMap.put("김길이", 5);

        System.out.println("HashMap의 요소 개수 = " + scoreMap.size());
        System.out.println("학생들의 점수 : ");
        for (String key : scoreMap.keySet()) { //scoreMap.keySet() : 모든 키를 반환.
            //key 변수에는 각각의 키가 대입

            Integer value = scoreMap.get(key); //scoreMap(key)에 해당하는 값을 반환하고 value에 대입
            System.out.println(key + " : " + value);
        }

    }
}
