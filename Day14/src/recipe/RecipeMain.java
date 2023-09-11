package recipe;

public class RecipeMain {

	public static void main(String[] args) {
		//Receipt receipt = new Receipt(); 
				// 오류 : 추상클래스는 직접 객체를 생성할 수 없다.
		
		PastaReceipt pr = new PastaReceipt("최연석");
		pr. info();
		pr.makeSource();
		
		System.out.println();
		
		StakeReceipt sr = new StakeReceipt("이연복");
		sr.info();
		sr.grillStake();
		
	}

}
