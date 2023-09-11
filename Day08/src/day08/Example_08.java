package day08;

public class Example_08 {

	public static void main(String[] args) {
		//아래 배열의 짝수들만 출력하시오!!
		int arr[] = {80,50,25,11,23,41,800,100};
		
		//배열의 갯수가 몇개게?
		System.out.println(arr.length + "\n");
		for(int i = 0; i<arr.length; i++) {
			if( (arr[i] % 2) == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
