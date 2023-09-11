package exam;

public class Example_10 {
    public static void main(String[] args) {
        /*
        substring()
         - 원하는 위치의 문자열을 잘라서 사용할 수 있는 메소드
         - 입력된 문자열 중 특정 위치의 문자를 추출할 수 있다.
         */
        String str = "1234-5678";
        String subStr = str.substring(5); //5번째 인덱스부터 추출시작
        System.out.println(subStr);

        String rangeStr = str.substring(0, 7); // 0번째부터 7번쨰까지 추출
        System.out.println(rangeStr);
    }
}
