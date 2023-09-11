package exam;

public class Example_01 {
        /*
        * throws - 예외 던지기
           -메소드 내부에서 예외가 발생할 수 있는 것을 대비해 try-catch 블록으로 예외를 처리한다
            그러니 경우에 따라서는 throws 키워드를 사용해
            메소드를 호출한 곳으로 예외를 떠넘길 수 있다.

         */

    public static void main(String[] args) {
        try {
            findClass(); // findlcass 메소드를 try구문 안에서 사용
        } catch (ClassNotFoundException e) {
            System.out.println("존재하지 않는 클래스입니다.");
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class cla = Class.forName("Java.lang.string");
        findClass(); // 내부의 코드에서 예외가 발생하면 그 예외를 호출한 곳으로 떠넘김
    }
}

