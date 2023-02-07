package model;

public class xeTai extends xe {

	protected double trongTai;

	public xeTai(double trongTai, String soXe, String hangXe, String NXS, String mau, Double soKM) {
		super(soXe, hangXe, NXS, mau, soKM);
		this.trongTai = trongTai;
	}

	public xeTai() {
	}

	public double getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}

	@Override
	public String toString() {
		return "xeTai{" + super.toString() + "trongTai=" + trongTai + " cap phat xang= " + getCapPhat();
	}

	@Override
	public double getCapPhat() {
		double sum = 0;
		if (soKM > 50) {
			sum = (soKM - 50) * 0.10;
		}
		return sum;
	}

}
