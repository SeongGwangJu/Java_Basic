package ex01;

public class Example_07 {

	public static void main(String[] args) {
		/*
		 * 변수(Variable)
		 *  -변수란, 어ㄸ한 값을 저장하고자 할 때 사용하는 메모리 공간.
		 *  -변수는 생성하는 즉시 어떠한 값을 넣어줘야 한다(초기화)
		 *  -변수에는 다양한 자료형을 담을 수 있다!(숫자, 문자, 문자열, bool 등등)
		 * 
		 * 형식) 데이터 타입을 반드시 써줘야한다. ex) double,
		 *  [데이터 타입] [변수명] = [저장할 값]
		 *
		 * 변수명 생성 규칙
		 *  -영문 문자와 숫자를 사용할 수 있다
		 *  -변수는 대소문자를 구분한다
		 *  -변수명 길이에는 제한이 없다
		 *  -예약어는 사용할 수 없다(if, else, else if, for 등등)
		 *  -첫 번째 글자는 문자이거나 $, _ 이어야 하고, 숫자로 시작할 수 없다
		 * 
		 * 변수명 표기법
		 *  -카멜 표기법, 파스칼 표기법, 헝가리안 표기법, 팟홀 표기법
		 * 
		 *  *카멜 표기법(Camel case)
		 *   -ex) String carNumber
		 *   - 각 단어의 첫 문자를 대문자로 표기하고 맨 처음 문자는 소문자로 표기
		 *  
		 *  *파스칼 표기법(Pascal case)
		 *    -ex) String CarNumber);
		 *    -카멜 표기법과 흡사하지만 맨 처음 오는 글자도 대문자로 표기
		 *     
		 *  *헝가리안 표기법
		 *    -ex) String strCarNumber ="123가4567"
		 *    -변수명 앞에 데이터타입을 표기
		 *    
		 *  *팟홀 표기법(pathole case)
		 *    -ex)String car_number;
		 *    -단어 사이에 언더바를 넣어서 변수명을 작성하는 방법
		 */
		/*
		 * int a;
		 * System.out.println(a); 라고 입력한다면? 초기화(initialize)가 안됐다고 뜬다.
		 * 지정하지 않았기 때문
		 * 따라서 a = 1; 이라고 해주야 된다
		 * 
		 * */
		int a = 1; // int는 숫자
		 System.out.println(a);
		
		String a12b = "윤준형"; //string은 문자열
		 System.out.println(a12b);
		
		 //int는 대소문자를 구별한다.
		int b = 10;
		int B = 11;
		System.out.println(b);
		System.out.println(B);
		
		//int는 길이 제한이 없다
		int asdkajsdkladjalksjdaslkdjalskd = 5;
		System.out.println(asdkajsdkladjalksjdaslkdjalskd);
		
		//첫 번째 글자는 문자이거나, $ or _ 이어야 함.
		int $a = 100;
		int _a = 200;
		int a1 = 300;
		//int 1a = 100; 숫자로 시작할 수 없다
		System.out.println($a);
		System.out.println(_a);
		System.out.println(a1);
		
		
		
	}
	
}
