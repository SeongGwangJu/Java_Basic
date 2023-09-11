package quiz;

public class Grade {
		public int mat;
		public int sci;
		public int eng;
		
		public Grade(int mat, int sci, int eng) {
			this.mat = mat;
			this.sci = sci;
			this.eng = eng;
			
		}
		
		public void main() {
			int avg = (this.mat + this.sci + this.eng) / 3; 
			System.out.println("평균은 " + avg);
		}
		
		//강사님은?
		public int average()
		{
			return (this.mat + this.sci + this.eng) /3;
			
		}
		
	
	
}
