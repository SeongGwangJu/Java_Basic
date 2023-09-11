package exam;

public class Example_07 {
    public static void main(String[] args) {
        /*
        charAt() : charAt()은 문자열에서 문자 하나를 추출할 수 있는 메소드
        */
        String string = "abcde";
        for (int i = 0; i < string.length(); i++) {
            System.out.println("string문자열" + i + "번째 인덱스 : " + string.charAt(i));
        }

        String str1 = "Hello World";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("str1문자열" + i + "번째 인덱스 : " + str1.charAt(i));
        }

        // length() : 문자열의 길이를 반환
        System.out.println(str1.length());
    }
}
