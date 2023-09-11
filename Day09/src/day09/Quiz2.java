package day09;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 5행 5열 크기의 2차원 배열 array를 선언하고
		 * 21~45까지 초기화하여 다음과 같이 출력하세요
		 * 
		 */
		int array[][] = new int [5][5];
		int a = 21;
		for(int i = 0; i<array.length; i++) {
			for(int j = 0 ; j<array[i].length; j++) {
				array [i][j] = a;
				a++;
				System.out.print(array[i][j] + " ");
			}
				System.out.println();
		}
	}

}
