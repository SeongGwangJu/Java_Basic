package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Quiz2 {
    public static void main(String[] args) {
        /*
        랜덤함수를 이용해 10개의 수를 추출하여
        list에 저장한 후 저장된 값들 중 최대값과 최소값을 구하는 코드를 작성하세요.
         */
        int max = 0;
        int min = 100;

        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            int temp = (int)(Math.random()*30) +1;
            list.add(temp);
        }
        System.out.println("전체 데이터 : " + list);
        // 강사님 풀이
        int max2 = Collections.max(list); //강사님 풀이용
        int min2 = Collections.min(list); // 강사님 풀이용
        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        //내 풀이
        for(int i = 0; i < list.size(); i++) {
            Integer value = list.get(i);
            if(max < value ) {
                max = value;
            }

            if(min > value) {
                min = value;
            }
        }
        System.out.println("최대값은 : " + max);
        System.out.println("최소값은 : " + min);

    }
}
