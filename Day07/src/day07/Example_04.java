package day07;

public class Example_04 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) { //10줄
			
			System.out.print("*");
			i++;
			int j = 1;
			while ( j<=10) {
				j++;
				System.out.print("*"); //1줄에 별 10개 추가요
			} 
			
			System.out.println(); //개행
			
		}
	}

}
