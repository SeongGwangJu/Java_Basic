package example;

//파일 이름(Example_03)과 동일한 클래스 이름만 접근제한자를 포함할 수 있다.
//Ex.
class Jogger { //는 되는데 'public class Jogger {}'는 안된다. 이름이 달라서 접근제한자 포함 안됨.
	void run() {
		System.out.println("run");
	}
}
public class Example_03 {
	public static void main(String[] args) {
		Jogger jog = new Jogger();
		jog .run();
		
	}

}
