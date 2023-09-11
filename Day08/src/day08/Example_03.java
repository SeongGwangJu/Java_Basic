package day08;

public class Example_03 {

	public static void main(String[] args) {
		/*
		 * 배열 선언과 초기값
		 */
		
		//5개의 공간을 가지는 배열 선언
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		//5개의 값을 가지는 배열 선언
		int[] varArray = {1,2,3,4,5};
		
		System.out.println("intArray[0] = " + intArray[0]);// int 배열에 아무것도 없으면 0
		System.out.println("intArray[1] = " + intArray[4]);
		
		System.out.println("strArray[0] = " + strArray[0]); //string배열에 아무것도 없으면 null
		System.out.println("strArray[1] = " + strArray[1]);
		
		System.out.println("varArray[0] = " + varArray[0]);
		System.out.println("varArray[3] = " + varArray[3]);
	}

}
