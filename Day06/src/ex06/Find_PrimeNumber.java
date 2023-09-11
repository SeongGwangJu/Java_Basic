package ex06;

public class Find_PrimeNumber {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int k = 2;
		
		for(i = 2; i <= 100; i++) {
			for(j = 1; j<=i; j++) {
				int primeNumber = i % j;
				if(primeNumber == 0 && j !=1 && i == j) {
					System.out.println(i +" "+ j);
					
				} 
				
			}
		}
	}
}