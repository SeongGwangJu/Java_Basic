package ex02;

public class Example_11 {

	public static void main(String[] args) {
		/*
		 * 메모리에 할당 받은 크기가 큰 자료형을,
		 * 크기가 작은 자료형으로 변환하면 데이터의 손실이 발생
		 */
		int i1 = 127;
		byte b1 = (byte) i1; //(byte)빼먹으면 오류발생
		System.out.println(b1);
		
		int i2 = 128;
		byte b2 = (byte) i2; //int -> byte 데이터 손실 발생
		System.out.println(b2);
		
		
		/* 크기가 작은 자료형에서 큰 자료형으로 변환할 때는 데이터 손실이 없어
		 * 형 변환을 생략할 수 있다
		 */
		byte b3 = 10;
		int i3 = b2; //byte ->int 데이터 손실 없이 형변환 생략 가능.
		System.out.println(i2);
		
		
	}

}
