package ex03;

public class Example_09 {
	public static void main(String[] args) {
		//복합 대입 연산자
		int x = 10;
		int y = 2;
		
		y += x; // y = x + y
		System.out.println(y);
		
	
		y *= x;
		System.out.println(y);
		
		y %= x;
		System.out.println(y);
		
		/*소스코드가 깔끔해지기는 하는데 
		가독성이 떨어져서 실무에서는 example_10처럼 쓴다.
		*/
	}
}
