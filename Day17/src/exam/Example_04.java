package exam;

import java.util.ArrayList;
import java.util.List;

public class Example_04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0;  i < 10; i++) {
            int temp = (int)(Math.random()*30) +1;
            list.add(temp);
        }

        System.out.println("전체 데이터 : " + list);

        for(int i = 0; i < list.size(); i++) {
            //List에서 각 index에 위치한 값을 가져오기
            Integer value = list.get(i); //돌면서 값 대입
            if(value % 2 ==0) {
                System.out.println(value);
            }

        }

    }
}
