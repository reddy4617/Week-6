
public class BreadBuilder {
	
	private String company;
	private String mfg;
	private String exp;
	
	
	public BreadBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	public BreadBuilder setMFG(String mfg) {
		this.mfg = mfg;
		return this;
	}
	public BreadBuilder setEXP(String exp) {
		this.exp = exp;
		return this;
	}
	
	public BuildBread getBread() {
		return new BuildBread(company, mfg, exp);
	}

}
