package ex06;

public class Example_07 {

	public static void main(String[] args) {
		/*
		 * while문
		 * 
		 * 형식)
		 * while(조건식) {
		 * 		실행문... => 조건식이 true일때 '반복'실행
		 * }
		 */
		int i = 1;
		while(i <= 10) {
			i++;
			System.out.println(i); 
			//i가 후위증가임을 명심! ->실행문 실행 후 +1 된다.
			//집에서 디버깅 꼭 해볼것!
		}
	}

}
