package advance.dev.model;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
}
