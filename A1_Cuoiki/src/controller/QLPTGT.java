package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.xe;
import model.xeOto;
import model.xeTai;

public class QLPTGT {
	public ArrayList<xe> listXe = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void nhapOto() {
		xeOto oto = new xeOto();

		System.out.println("nhap so xe: ");
		oto.setSoXe(sc.nextLine());
		sc.nextLine();
		System.out.println("nhap hang xe: ");
		oto.setHangXe(sc.nextLine());
		System.out.println("nhap nam san xuat: ");
		oto.setNXS(sc.nextLine());
		System.out.println("nhap mau: ");
		oto.setMau(sc.nextLine());
		System.out.println("nhap so km trong ngay: ");
		oto.setSoKM(sc.nextDouble());
		System.out.println("nhap so cho ngoi: ");
		oto.setSoChoNgoi(sc.nextInt());
		sc.nextLine();
		System.out.println("nhap kieu dong co: ");
		oto.setKieuDongCo(sc.nextLine());
		oto.getCapPhat();
		listXe.add(oto);

	}

	public void nhapXeTai() {
		xeTai xeTai = new xeTai();

		System.out.println("nhap so xe: ");
		xeTai.setSoXe(sc.nextLine());
		sc.nextLine();
		System.out.println("nhap hang xe: ");
		xeTai.setHangXe(sc.nextLine());
		System.out.println("nhap nam san xuat: ");
		xeTai.setNXS(sc.nextLine());
		System.out.println("nhap mau: ");
		xeTai.setMau(sc.nextLine());
		System.out.println("nhap so km trong ngay: ");
		xeTai.setSoKM(sc.nextDouble());
		System.out.println("nhap trong tai: ");
		xeTai.setTrongTai(sc.nextDouble());
		xeTai.getCapPhat();
		listXe.add(xeTai);
	}

	public void output() {
		for (xe o : listXe) {
			System.out.println(o);
		}
	}

	public void delete() {
		int count = 0;
		System.out.println("xoa xe co so xe la 43A-12345");
		for (int i = 0; i < listXe.size(); i++) {
			if (listXe.get(i).getSoXe().equalsIgnoreCase("43A-12345")) {
				listXe.remove(listXe.get(i));
				System.out.println("xoa ma 43A-12345 thanh cong !");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("khong tim thay ma 43A-12345 de xoa !");
		}
	}

	public void ThongKe() {
		int count = 0;
		for (int i = 0; i < listXe.size(); i++) {
			if (listXe.get(i).getSoKM() > 50) {
				System.out.println(listXe.get(i));
				count++;
			}
		}
		System.out.println("tong so xe chay tren 50km tren ngay la : " + count);
	}

	public void write(String fname) {
		IOFile.writeFile(fname, listXe);
	}

	public void read(String fname) {
		IOFile.readFile(fname);
	}

	@Override
	public String toString() {
		return "QLPTGT{" + super.toString() + "listXe=" + listXe + '}';
	}

}
