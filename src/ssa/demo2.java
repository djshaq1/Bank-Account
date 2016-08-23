package ssa;

public class demo2 {
	private int counter;
	private String description;
	private String name;
	private int step;
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		if(step <= 1 && step <= 10)
			this.step = step; 
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String adescription) {
		this.description = adescription;
	}
	public demo2() {
		this.step = 1;
	}
	public demo2(int aStep) { //calls setStep method
		this.setStep(aStep);
	}
	void test() {
	demo2 demo2 = new demo2();
	
	demo2.setDescription("a new description");
	String str = demo2.getDescription(); 
	}
}



