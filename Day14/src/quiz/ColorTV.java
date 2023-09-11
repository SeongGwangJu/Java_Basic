package quiz;

public class ColorTV extends TV{

	public ColorTV(int size) {
		super(size);
	}

	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public ColorTV(int size, String color) {
		super(size);
		this.color = color;
	}
	public	void printproperty() {
			System.out.println(this.getSize() + "인치 " + color);
		}
	

	}

