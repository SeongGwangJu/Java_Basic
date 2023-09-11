package exam;

public class Example_11 {
    public static void main(String[] args) {
        /*
        StringBuilder()
         - String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아닌
         기존 데이터에 더하는 방식을 사용하기 때문에 속도가 빠르고 상대적으로 부하가 적다.
         */
        String str1 = "abc";
        String str2 = "def";
        System.out.println(str1 + str2); //새로운 객체가 생성됨

        StringBuilder str = new StringBuilder();
        str.append("Hello");
        str.append((" world"));
        System.out.println(str);
    }
}
