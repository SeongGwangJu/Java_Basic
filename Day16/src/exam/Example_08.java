package exam;

public class Example_08 {
    public static void main(String[] args) {


    /*
    indexOf()
     - 저장된 문자열 중에서 찾는 특정 단어 또는 문장의 시작 위치를 알려주는 메소드
     - 중복된 단어가 있으면 indexOf() 메소드는 처음 검색되는 단어의 위치를 나타냄
     */
        String str = "HelloWorld_MyWorld";
        System.out.println(str.length());

        //처음 위치에서 검색
        System.out.println("World 단어 위치 : " + str.indexOf("World"));
        System.out.println("World 단어 위치 : "
                + str.indexOf("World", 10)); //10번째 부터 World를 찾아보자

        String indexOfTest = "abcde abcde";
        System.out.println(indexOfTest.indexOf("d"));
        System.out.println(indexOfTest.indexOf(" "));
        System.out.println(indexOfTest.indexOf("d", 5)); //5번째부터 d를 찾아보자


    }
}
