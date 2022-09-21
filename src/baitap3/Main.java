package baitap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date da = new Date(1,1,2022);
        Date db = new Date(2,2,2022);
        KhachHangVietNam vn = new KhachHangVietNam("+84","Nguyễn Văn An",da,"Sinh Hoạt");
        KhachHangNuocNgoai nn = new KhachHangNuocNgoai("99","Jack",db,"USA");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số kW khách hàng vn");
        double a = sc.nextDouble();
        System.out.println("Nhập vào số kW khách hàng nn");
        double b= sc.nextDouble();
        System.out.println("Số tiền điện khách hàng vn "+vn.thanhTien(a));
        System.out.println("Số tiền điện khách hàng nn "+nn.thanhTien(b));
        System.out.println(vn.ngayHoaDon.toString());
        System.out.println(nn.ngayHoaDon.toString());


    }
}
