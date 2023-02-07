package model;

public class xeOto extends xe {

	protected int soChoNgoi;
	protected String kieuDongCo;

	public xeOto(int soChoNgoi, String kieuDongCo, String soXe, String hangXe, String NXS, String mau, Double soKM) {
		super(soXe, hangXe, NXS, mau, soKM);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	public xeOto() {
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}

	@Override
	public String toString() {
		return "xeOto{" + super.toString() + "soChoNgoi=" + soChoNgoi + ", kieuDongCo=" + kieuDongCo
				+ " cap phat xang = " + getCapPhat();
	}

	@Override
	public double getCapPhat() {
		double sum = 0;
		if (soKM > 50) {
			sum = (soKM - 50) * 0.15;
		}

		return sum;
	}

}
