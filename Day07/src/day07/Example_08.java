package day07;

public class Example_08 {

	public static void main(String[] args) {
		int arr[] = new int[4]; //4개의 공간을 가진 배열을 선언
		
		// 배열의 값을 넣기
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		//배열의 값을 출력할 때는 반복문을 돌려야한다!
	}

}
