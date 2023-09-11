package exam;

public class Example_12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");

        //문자열 추가
        System.out.println(sb.append("def"));
        System.out.println(sb.append("4"));

        //문자열 삽입
        System.out.println(sb.insert(2, "123"));

        //문자열 삭제
        System.out.println(sb.delete(2, sb.length())); //2번째부터 끝까지 삭제

        //문자열 뒤집기
        System.out.println(sb.reverse());
    }
}
