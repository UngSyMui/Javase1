package baitap3;

public class KhachHangVietNam extends KhachHang {
    protected String doiTuong;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String doiTuong) {
        this.doiTuong = doiTuong;
    }

    public KhachHangVietNam(String maKhachHang, String hoVaTen, Date ngayHoaDon, String doiTuong) {
        super(maKhachHang, hoVaTen, ngayHoaDon);
        this.doiTuong = doiTuong;
    }
}
