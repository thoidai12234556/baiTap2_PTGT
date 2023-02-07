package run;

import controller.QLPTGT;
import java.util.Scanner;
//import javax.xml.transform.Source;

public class main {
	public static void main(String[] args) {
		QLPTGT QL = new QLPTGT();
		Scanner sc = new Scanner(System.in);
		String fname = "D:\\Workspace\\A1_Cuoiki\\src\\run\\filePhuongTien.txt";
		int option;
		do {
			System.out.println("0. exit !");
			System.out.println("1.nhap oto");
			System.out.println("2.nhap xe tai");
			System.out.println("3.in ra");
			System.out.println("4.ghi file");
			System.out.println("5.doc file");
			System.out.println("6.xoa phuong tien");
			System.out.println("7.thong ke xe tren 50km/ngay");
			System.out.println("lua chon option : ");
			option = sc.nextInt();
			switch (option) {
			case 0:
				System.exit(0);
				break;
			case 1:
				QL.nhapOto();
				break;

			case 2:
				QL.nhapXeTai();
				break;

			case 3:
				QL.output();
				break;

			case 4:
				QL.write(fname);
				break;
			case 5:
				QL.read(fname);
				break;
			case 6:
				QL.delete();
				break;
			case 7:
				QL.ThongKe();
				break;

			default:
				System.out.println(" k co option day !");

			}

		} while (option != 0);
	}
}
