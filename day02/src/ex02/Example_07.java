package ex02;

public class Example_07 {

	public static void main(String[] args) {
		/*
		 * char(형) = 1byte
		 * -문자 그대로를 저장하는 것이 아닌, 유니코드라는 숫자로 값을 변환하여 저장
		 * 유니코드란? 전 세계의 문자를 일관되게 표현할 수 있도록 설계된 표준
		 */
		char ga = '가';
		char na = '나';
		char a = 'A';
		char b = 'b';
		//char ga = '가가가'; -> char형은 한개 이상의 문자를 저장할 시 오류발생!!
		System.out.println(ga);
		System.out.println(na);
		System.out.println(a);
		System.out.println(b);
		
		
		int alphabet1 = 'A';
		int alphabet2 = 'B';
		int alphabet3 = 'a';
		int alphabet4 = 'b';
		
		System.out.println("==================\n "
				+ "int형에 알파벳을 넣으면 아스키코드에 맞는 숫자로 출력이된다");
		System.out.println(alphabet1);
		System.out.println(alphabet2);
		System.out.println(alphabet3);
		System.out.println(alphabet4);
		
		System.out.println("==================\n "
				+ "char형에 숫자를 넣으면 아스키코드에 맞는 문자로 출력이된다");
		char a1 = 65;
		System.out.println(a1);
		char a2 = 66;
		System.out.println(a2);
		
	}

}
