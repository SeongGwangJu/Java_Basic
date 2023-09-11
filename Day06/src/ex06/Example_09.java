package ex06;

public class Example_09 {

	public static void main(String[] args) {
		/*
		 * 무한루프
		 */
		int i = 0;
		while(true) {
			if(i==10){
				break;
			}
			i++;
			System.out.println(i);
		}

	}
	/*
	 * while문과 for문
	 * for문
	 * -구하고자 하는 값의 조건이 무엇인지 명확할 경우 사용하는 것이 좋음
	 * - 또한 초기값 조건식 증감식이 while문과 달리 블록에서 바로 찾을 수 있어서 가독성이 좋음
	 * 
	 * while문
	 * - 구하고자 하는 값의 조건을 정확하게 모를 경우, 즉 유동적인 경우에 사용하면 좋다.
	 * - 조건식이 한 곳에 모여있지 않아 가독성이 나쁘다.
	 * 
	 * 	for (int i = 10; i>0; i--) {
			System.out.println(i);
			-------------
			while(int i <= 10) {
			i++;
			System.out.println(i); 
	 */
}
