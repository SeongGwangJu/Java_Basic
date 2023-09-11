package Day04;

public class Example_12 {

	public static void main(String[] args) {
			//두 과목의 평균 점수를 산출해 70점 이상이면 합격
			// 70점 미만이거나 한 과목이 50점 미만이면 불합격으로 처리하는 프로그램
		
	int kor = 80, eng = 70;
	double avg = (kor + eng) /2.0;
	
	if(kor <50 || eng <50) {
		System.out.println("한 과목이 50점 미만이므로 \n 불합격(과락)입니다");
	} else if(avg >=70) {
		System.out.println("두 과목의 평균 점수가 70점 이상이므로 \n 합격입니다");
	} else {
		System.out.println("두 과목의 평균 점수가 70점 미만이므로\n 불합격입니다.");
	}
	// 과락판단 -> 합격판단 -> 나머지는 불합격
	//만약 나였으면? 평균값 합격 먼저 판단-> else if 과락 -> else if 불합격
	if(avg >= 70) {
		System.out.println("합격입니다");
	} else if(kor <50 || eng <50) {
		System.out.println("과락입니다");
	} else {
		System.out.println("평균 점수 70 미만으로 불합격입니다");
	}
	}

}
