package baitap3;

public class KhachHangNuocNgoai extends KhachHang {
  protected String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(String maKhachHang, String hoVaTen, Date ngayHoaDon, String quocTich) {
        super(maKhachHang, hoVaTen, ngayHoaDon);
        this.quocTich = quocTich;
    }

    @Override
    public double thanhTien(double soLuong) {
        return soLuong*2000;
    }
}
