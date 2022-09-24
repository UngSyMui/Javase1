package session1;

public class Main {
    public static void main(String[] args) {
        Fraction fra =new Fraction(4,12);
        Fraction frb = new Fraction(4,12);
        fra.print();
        fra.rutgon();
        fra.nghichdao();
        frb.rutgon();
        HoaDonCaPhe hd1 = new HoaDonCaPhe("Trung Nguyên",100000,1.5);
        HoaDonCaPhe hd2 = new HoaDonCaPhe("Abrica",200000,3);
        System.out.println("Tổng tiền: "+hd1.tinhTongTien());
        System.out.println("Kiểm tra khối lượng lớn hơn 2 kg "+ hd1.ktKhoiLuongLonHon(2));
        System.out.println("Kiem tra tổng tiền lớn hơn 500K"+hd1.ktTongTienLonHon500K());
        System.out.println("Kiem tra tổng tiền lớn hơn 500K"+hd2.ktTongTienLonHon500K());
        System.out.println("Giảm giá của Hd1 "+ hd1.giamGia(10));
        System.out.println("Giảm giá của Hd2 "+ hd2.giamGia(10));

    }
}
