package ex02;

public class example_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수를 이용해 다른 변수에 복사
		int myAge = 20; //myAge라는 변수에 20을 넣음
		int yourAge = myAge; //yourAge에 myAge에 저장되어 있는 값을 넣음
		System.out.println(myAge);
		System.out.println(yourAge);
		
		//변수값 서로 바꾸기
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("================");
		int temp = 0; //x의 값을 임시저장할 변수 선언
		temp = x; // temp에 x의 값을 넣는다
		x = y; //x에 y를 넣는다
		y = temp; //y에 temp의 값을 넣는다
		System.out.println("x= " +x);
		System.out.println("y= " +y);
	}

}
