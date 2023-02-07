package model;

public abstract class xe {
	protected String soXe;
	protected String hangXe;
	protected String NXS;
	protected String mau;
	protected Double soKM;

	public xe(String soXe, String hangXe, String NXS, String mau, Double soKM) {
		this.soXe = soXe;
		this.hangXe = hangXe;
		this.NXS = NXS;
		this.mau = mau;
		this.soKM = soKM;
	}

	public xe() {
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public String getHangXe() {
		return hangXe;
	}

	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
	}

	public String getNXS() {
		return NXS;
	}

	public void setNXS(String NXS) {
		this.NXS = NXS;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public Double getSoKM() {
		return soKM;
	}

	public void setSoKM(Double soKM) {
		this.soKM = soKM;
	}

	public abstract double getCapPhat();

	@Override
	public String toString() {
		return "soXe=" + soXe + ", hangXe=" + hangXe + ", NXS=" + NXS + ", mau=" + mau + ", soKM=" + soKM;
	}

}
