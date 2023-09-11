package exam;

public class Km2Mile extends Converter {
	double mile;
	
	public Km2Mile(double mile) {
		this.mile = mile;
		
	}

	@Override
	protected double convert(double src) {
		return src / this.mile;
				
		
	}

	@Override
	protected String getSrcString() {
		return "km";
				
		
	}

	@Override
	protected String getDestString() {
		return "Mile";
				
		
	}

}
