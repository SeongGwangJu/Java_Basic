package exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example_02 {
    public static void main(String[] args) {
        /*
         * List
          - List는 배열과 유사한 자료구조로 중복이 허용되면서 저장 순서가 유지되는 구조
          - 배열과의 차이점은 크기에 제한이 없고, 삽입, 삭제, 수정이 용이함
          - List 컬렉션은 List 인터페이스를 생성하여 기능을 정의하고
           하위 클래스에 상속해 그 기능을 구현하도록 한다

         형식)
            List<Obj> list = new ArrayList<obj>();
            List<Obj> list = new ArrayList<>();
                -Obj: : 리스트에 저장할 데이터 유형
                -ArrayList : 클래스
         */

        List<String> list1 = new ArrayList<String>();
        list1.add("사과");
        list1.add("딸기");
        list1.add("바나나");
        System.out.println(list1); //배열과 유사, 중복허용, 저장순서 유지

        /* 기술 면접 단골질문
          int : 정수형 변수를 선언할 때 사용. 기본자료형 ->stack 메모리에 저장 = 메모리에 효율적 산술연산용
          Integer : 정수형 데이터를 객체화 시킬 때 사용. 객체형. heap 메모리에 저장. 여러 메서드 사용 가능.
         */
        // int a = null;
        Integer a1 = null; //int와 다르게 null값을 넣을 수 있다. 객체라서 가능.


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        /*
        1. List<> list3 = new ArrayList();
        2. ArrayList<> list4 = new ArrayList();
          - List는 인터페이스고, ArrayList는 이 List를 구현한 클래스
            그러므로 List로 선언을 한 경우 인스턴스를 ArrayList로 받을 수 있고 LinkedList로도 받을 수 있다
          - 반면 2번째 방법으로 선언한 경우 ArrayList의 인스턴스를 만들어야 하므로
            ArrayList로 받아야 함.
        */

        List<Integer> list = new ArrayList<>();
        list = new LinkedList<Integer>();

        /*
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist = new LinkedList<>(); //안됨
        */
    }
}
