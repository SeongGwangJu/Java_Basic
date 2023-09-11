package ex06;

public class Example_06 {

	public static void main(String[] args) {
		/*
		 *  1 ~ 100 짝수들의 합을 구하세요!
		 */
		
		int sum = 0;
		for(int i = 2; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		//강사님 풀이
		int sum2 = 0;
		for(int i =1; i<=100; i++) {
			if(i % 2==0) {
				sum = sum + i;
			}
			
		}
		System.out.println("짝수들의 합 : "+ sum2);
	}

}
