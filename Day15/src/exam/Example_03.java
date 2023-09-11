package exam;

class PrintOut { //외부클래스 PrintOut
	public static class Out { //'PrintOut' 클래스의 정적내부클래스 Out.
		void println(String str) { //메서드 println
			System.out.println(str);
		}
	}
}
public class Example_03 {
	/* *정적내부 클래스
	 * -인스턴스 변수와 마찬가지로 static 키워드를 사용해 정적 내부 클래스를 선언한다.
	 * -주로 외부 클래스의 static 메소드에서 사용될 목적으로 선언됨
	 * -정적 변수와 마찬가지로 클래스에 속하지만 독립적으로 존재한다.
	 * -static 키워드로 인해 이미 클래스 멤버로써 메모리에 올라가 있는 상태기 때문에 외부클래스의 호출이 따로 필요하지 않음.
	 * 
	 */
	public static void main(String[] args) {
		
		String str = "Hello world";
		
	//외부 클래스 없이 정적 클래스 객체를 생성!!
		PrintOut.Out out = new PrintOut.Out(); //out.out클래스의 인스턴스 생성.
		out.println(str); //out 클래스의 println메서드 호출해 출력
		
	}

}
