package baitap3;

public class KhachHang {
   protected String maKhachHang, hoVaTen;
   protected Date ngayHoaDon;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoVaTen, Date ngayHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(Date ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public double thanhTien(double soLuong){
        if(soLuong>=0&&soLuong<50){
            return soLuong*1000;
        }else if(soLuong>=50&&soLuong<=100){
            return 50*1000+(soLuong-50)*1200;
        }else if(soLuong>100&&soLuong<=200){
            return 50*1000+50*1200+(soLuong-100)*1500;
        }else{
            return 50*1000+50*1200+100*1500+(soLuong-200)*2000;
        }
    }
}
