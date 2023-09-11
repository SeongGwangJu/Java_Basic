package day09;

public class Example_03 {
	public static void main(String[] args) {
		/* 
		 * 버블정렬
		 * int arr[] = {7,4,5,1,3}
		 * 오름차순 : 1 3 4 5 7
		 * 내림차순 : 7 5 4 3 1
		 * 7 4 5 1 3 에서 0번방부터 뒤에거와 비교해서 크면 뒤로 보낸다
		 * 그러면 4 7 5 1 3 -> 4 5 7 1 3 ... -> 4 5 1 3 7 (1st)
		 * -> 4 5 1 3 7 -> 4 1 5 3 7 -> 4 1 3 5 7(2nd)
		 * -> 1 4 3 5 7 -> 1 3 4 5 7
		 */
		
		//미완성된 코드, 카페확인 후 수정(Test2 or 교재). 수정후 이 문장은 지울 것.
		int arr[] = {7,4,5,1,3};
		int temp = 0 ;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1; j<arr.length-1; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j-1] = temp;
				}
			}
		}
	}
}
