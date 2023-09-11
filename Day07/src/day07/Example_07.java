package day07;

public class Example_07 {

	public static void main(String[] args) {
		/*
		 * new 연산자 - 객체를 생성할때 사용.
		 * - new연산자는 객체를 Heap 영역에 메모리 공간을 할당해주고
		 * 메모리 주소를 반환한 후 생성자를 실행시켜 준다
		 * -new연산자로 생성된 객체는 똑같은 값을 가졌어도 서로 다른 메모리를 할당하기 때문에
		 * 서로 다른 객체로 분류된다.
		 */
		
		//str1의 객체랑 str2의 객체랑 서로 다른 메모리 주소를 공유함
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		/*
		 * *왜 다르다가 출력되나?
		 * 참조 타입에서의 ==연산자는 동일한 객체를 참조하는지 아닌지를 판별
		 * 하지만 str1이랑 str2랑은 다른 메모리 주소를 공유하기 때문에 같은 내용이라도 주소가 달라서
		 */
		
	}

}
