package ex01;

public class Example_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실수 출력 : %f
		double a= 1.1;
		System.out.printf("%f살 \n", a);
		System.out.printf("%f살 \n", 1.1234561); //기본은 7번째짜리인데 끝을 반올림해서 내림.
		System.out.printf("%f살 \n", 1.1234566); //이건 올림함
		System.out.printf("%.2f \n", 1.12345689); // .n을 붙이면 소수점 n째자리까지 출력
		System.out.printf("%.3f \n", 1.123);
		System.out.printf("%.8f \n", 1.12345678);
		System.out.printf("%.8f \n", 1.12345678999); //올림
		
		
		//문자열 : %s 
		String str = "Hello Java";
		System.out.printf("%s\n", str);
		
		//문자출력 = %c
		char c = 'A'; // A가 AB로 바뀌면 안됨. '문자'이기 때문.
		System.out.printf("%c\n", c);
	}

}
