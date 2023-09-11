package exam;


	public class Won2Dollar extends Converter {
		//생성자 만들기 -> 멤버변수 만들기
		int dollar;
		
		public Won2Dollar(int dollar) {
			this.dollar = dollar;
			}

		
		//override
		@Override
		protected double convert(double src) {
			double result = src / this.dollar;
			return result;

		}

		@Override
		protected String getSrcString() {
			return "원";
					
			
		}

		@Override
		protected String getDestString() {
			return "달러";
					
			
		}

	public Won2Dollar() {
	}

	private String getSrcString;
	private String getDestString;
	
	//위 변수 2개의 getset
	public String getGetSrcString() {
		return getSrcString;
	}
	public void setGetSrcString(String getSrcString) {
		this.getSrcString = getSrcString;
	}
	public String getGetDestString() {
		return getDestString;
	}
	public void setGetDestString(String getDestString) {
		this.getDestString = getDestString;
	}
	
}
