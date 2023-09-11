package exam;

interface Test1 {
	void test1();
}

interface Test2 {
	void test2();
}

interface Test3 extends Test1, Test2 { //Test3는 Test1, Test2를 상속받고
	void test3(); //추상메서드 선언
} //인터페이스는 추상메서드의 집합, 구현클래스에서 해당메서드를 구현해야 함.


class TestCle1 implements Test1 {
	@Override
	public void test1() {	
		
	}
}

class TestCle2 implements Test2 {
	@Override
	public void test2() {
	}
}

class TestCle3 implements Test3 {

	@Override
	public void test1() {
	}

	@Override
	public void test2() {
	}

	@Override
	public void test3() {
	}
	
}
public class Example_04 {
	public static void main(String[] args) {
		/* 인터페이스 상속
		 * - 인터페이스끼리만 상속 가능함
		 * - 상속을 통해 기존 인터페이스에 새로운 규격을 추가한 새로운 인터페이스를 만들 수 있다.
		 * - 인터페이스끼리의 상속은 'extends'키워드를 사용한다.
		 * 
		 */
	}

}

