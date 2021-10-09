
public class BuildBread {
	
	private String company;
	private String mfg;
	private String exp;
	
	public BuildBread(String company, String mfg, String exp) {
		super();
		this.company = company;
		this.mfg = mfg;
		this.exp = exp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getMFG() {
		return mfg;
	}

	public void setMFG(String mfg) {
		this.mfg = mfg;
	}

	public String getEXP() {
		return exp;
	}

	public void setEXP(String exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return " \n --------  Company :: " + company + " \n --------  MFG DATE" + mfg + " \n --------  EXPIRAY DATE :: " + exp + "]";
	}

}
