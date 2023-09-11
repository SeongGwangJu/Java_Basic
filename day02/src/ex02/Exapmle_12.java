package ex02;

public class Exapmle_12 {

	public static void main(String[] args) {
		/*
		 * 실수형 간의 형 변환
		 * -크기가 큰 자료형(double)에서 작은 자료형(flaot)으로 변환할 때
		 * float의 저장 범위를 넘어서는 값을 대입하면 무한대가 되거나 0이된다
		 */
		// 1.0e100(10의 100승)
		double d1 = 1.0e100;
		float f1 = (float) d1; //float의 최대 범위를 초과한 상태
		System.out.println(f1);
		System.out.println(d1 +"\n");
		
		double d2 = 1.0e-100;
		float f2 =(float) d2;
		System.out.println(f2 + "\n"); //float의 저장 범위를 넘어서서 0.0으로 출력
		
		double pie = 3.14;
		int pieIne = (int) pie;
		System.out.println(pieIne + "\n"); //실수형을 정수형으로 출력해 소수점의 데이터 손실
		
		int num = 100;
		double numD = (double) num;
		float numF = (float) 100; 
		System.out.println(numD);
		System.out.println(numF + "\n");// 정수형 -> 실수형은 데이터 손실 없음. 근데 소수점도 출력됨
		
		int i = 99999999;
		float f = (float) i;
		System.out.println(f + "\n"); //
	}

}
