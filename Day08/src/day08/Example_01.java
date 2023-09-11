package day08;

public class Example_01 {

	public static void main(String[] args) {
		/*
		 * 배열(array)
		 * - 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다룸
		 * - 생성된 배열의 각 저장공간을 배열의 요소라고 하며
		 * 인덱스(index)는 배열의 요소마다 붙혀진 일련번호로 각 요소를 구분하는데 사용한다.
		 * (인덱스의 범위는 0부터 ~ 배열길이의 -1까지)
		 * 
		 */
		int arr[] = new int[5]; //heap영역에 5만큼 메모리 공간을 할당
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//System.out.println(arr[5]); 이건 오류뜸
		for(int i = 0; i <arr.length; i++) {
			arr[i] = i + 1; //[0]에는 1, [1]에는 2 입력
		}
		System.out.println(arr); //주소값 출력
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); //arr[0]부터 [4]까지 출력
		}
		
		String[] str = {"사과", "포도", "바나나"};
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		int list[] = null; //what is null?
		list = new int[4];
		for(int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		
		for(int i = 0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
