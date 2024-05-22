package advance.dev;

import advance.dev.dao.Manager;
import advance.dev.model.CongNhan;
import advance.dev.model.KySu;
import advance.dev.model.NhanVien;
import advance.dev.model.CanBo;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Manager manager = new Manager();

		Scanner scanner = new Scanner(System.in);

		// Thêm 2 công nhân
		for (int i = 0; i < 2; i++) {
			System.out.print("Nhập tên công nhân: ");
			String ten = scanner.nextLine();
			System.out.print("Nhập tuổi: ");
			int tuoi = Integer.parseInt(scanner.nextLine());
			System.out.print("Nhập giới tính: ");
			String gioiTinh = scanner.nextLine();
			System.out.print("Nhập địa chỉ: ");
			String diaChi = scanner.nextLine();
			System.out.print("Nhập bậc: ");
			int bac = Integer.parseInt(scanner.nextLine());

			CanBo congNhan = new CongNhan(ten, tuoi, gioiTinh, diaChi, bac);
			manager.add(congNhan);
		}

		// Thêm 1 kỹ sư
		System.out.print("Nhập tên kỹ sư: ");
		String ten = scanner.nextLine();
		System.out.print("Nhập tuổi: ");
		int tuoi = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập giới tính: ");
		String gioiTinh = scanner.nextLine();
		System.out.print("Nhập địa chỉ: ");
		String diaChi = scanner.nextLine();
		System.out.print("Nhập ngành đào tạo: ");
		String nganhDaoTao = scanner.nextLine();

		CanBo kySu = new KySu(ten, tuoi, gioiTinh, diaChi, nganhDaoTao);
		manager.add(kySu);

		// Thêm 2 nhân viên
		for (int i = 0; i < 2; i++) {
			System.out.print("Nhập tên nhân viên: ");
			String tenNV = scanner.nextLine();
			System.out.print("Nhập tuổi: ");
			int tuoiNV = Integer.parseInt(scanner.nextLine());
			System.out.print("Nhập giới tính: ");
			String gioiTinhNV = scanner.nextLine();
			System.out.print("Nhập địa chỉ: ");
			String diaChiNV = scanner.nextLine();
			System.out.print("Nhập công việc: ");
			String congViec = scanner.nextLine();

			CanBo nhanVien = new NhanVien(tenNV, tuoiNV, gioiTinhNV, diaChiNV, congViec);
			manager.add(nhanVien);
		}

		// In danh sách cán bộ
		System.out.println("Danh sách cán bộ:");
		manager.print();

		// Sắp xếp và in danh sách theo thứ tự tên tăng dần
		System.out.println("Danh sách cán bộ sắp xếp theo tên tăng dần:");
		manager.sortByName(1);
		manager.print();

		// Sắp xếp và in danh sách theo thứ tự tên giảm dần
		System.out.println("Danh sách cán bộ sắp xếp theo tên giảm dần:");
		manager.sortByName(-1);
		manager.print();
	}
}
