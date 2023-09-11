package exam;

class OuterClass {
	void method() {
		class LocalInner { // a의 값을 선언하는 지역클래스 정의
			int a = 5;
		}
		
		LocalInner li = new LocalInner(); //인스턴스 생성
		System.out.println(li.a);
	}
}
public class Example_04 {
	
	public static void main(String[] args) {
		/*
		 * 지역클래스
		 * -외부클래스의 메소드 내에서 선언되어 사용하는 클래스
		 */
		
		OuterClass out = new OuterClass();
		out.method();
		
	}

}
