package exam;

public class Example_05 {
    public static void main(String[] args) {
        /*
        hashCode
         - 객체를 식별하는 Integer 값
         - 객체가 갖고있는 데이터를 어떤 알고리즘에 적용하여
         계산된 정수값을 hashCode 라 한다.
         - hashCode 가 다르면, 두개의 객체가 같지 않다.
         - hashCode 가 같으면 두개의 객체가 같거나 다를 수 있다.
         */
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "apple";

        System.out.println("str1 hashCode = " + str1.hashCode());
        System.out.println("str2 hashCode = " + str2.hashCode());
        System.out.println("str3 hashCode = " + str3.hashCode());
    }
}
