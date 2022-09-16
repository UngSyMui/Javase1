package session1;

import java.util.Scanner;

public class DemoBt {
//   public static void main(String[] args){
//       //Cách nhập dữ liệu từ bàn phím
////       Scanner sc = new Scanner(System.in);
////       System.out.println("Nhap vao ho va ten: ");
////       String hoVaTen = sc.nextLine();
////       System.out.println("Nhap ma sinh vien");
////       long maSinhVien = sc.nextLong();
////       System.out.println("Nhap vao diem thi");
////       float diemThi = sc.nextFloat();
////
////       System.out.println("---------");
////
////       System.out.println("Ho va ten: " +hoVaTen);
////       System.out.println("Ma sinh vien: "+maSinhVien);
////       System.out.println("Điểm Thi: " +diemThi);
//
//   }
//
//    public static void main(String[] args){
//        //Ép kiểu dữ liệu
//        int a=100;
//        int b=2;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        float c=a;
//        float d=b;
//        System.out.println(c);
//        System.out.println(d);
//        float e = 3.5F;
//        float f = 9.5F;
//        System.out.println("e="+e);
//        System.out.println("f="+f);
//        int g=(int)e;
//        int h=(int)f;
//        System.out.println("g="+g);
//        System.out.println("h="+h);
//        //Ép kiểu dữ liệu đối tượng
//
//
//    }
//}
//public static void main(String[] args){
//    //Khai báo biến
//    int a, b;
//    //Nhập dữ liệu từ bàn phím
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Nhập vào a = ");
//    a = sc.nextInt();
//    System.out.println("Nhập vào b = ");
//    b = sc.nextInt();
//
//    int tong = a+b;
//    System.out.println(a+"+"+b+"="+tong);
//    int hieu =a-b;
//    System.out.println(a+"-"+b+"="+hieu);
//    int nhan =a*b;
//    System.out.println(a+"x"+b+"="+nhan);
//    float thuong=(float)a/b;
//    System.out.println(a+"/"+b+"="+thuong);
//    int soDu = a%b;
//    System.out.println(a+"%"+b+"="+soDu);
//
//}
//
//    public static void main(String[] args){
//        double a, b;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so a =");
//        a = sc.nextDouble();
//        System.out.println("Nhap vao b =");
//        b = sc.nextDouble();
//        //Hàm lấy trị tuyệt đối
//        System.out.println("|a| = "+Math.abs(a));
//        //Hàm tìm min
//        System.out.println("Min(a,b) = "+Math.min(a,b));
//        //Hàm tìm max
//        System.out.println("Max(a,b) = "+Math.max(a,b));
//        //Hàm tìm ceil
//        System.out.println("ceil(a) = "+Math.ceil(a));
//        //Hàm floor
//        System.out.println("floor(a) = "+Math.floor(a));
//        //Hàm sqrt
//        System.out.println("sqrt(a) = "+Math.sqrt(a));
//        //Hàm a mũ b
//        System.out.println("pow(a,b) =" +Math.pow(a,b));
//    }
//public static void main(String[] args) {
//    double r,dienTich,chuVi;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Nhap ban kinh r");
//    r= sc.nextDouble();
//    //Tính chu vi
//    chuVi= 2*Math.PI*r;
//    System.out.println("Chu Vi = "+chuVi);
//    System.out.println("Chu Vi = "+Math.round(chuVi*100.0)/100.0);
//    //Tính diện tích
//    dienTich = Math.PI*Math.pow(r,2);
//    System.out.println("Dien Tich ="+dienTich);
//    System.out.println("Dien Tich ="+Math.round(dienTich));
//}
//public static void main(String[] args) {
//    int n;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Nhap vao n=");
//    n = sc.nextInt();
//    String ketQua = (n%2==0)?"số chẵn":"số lẻ";
//    System.out.println(n+" là "+ ketQua);
//}
//    public static void main(String[] args){
//        //Phương trình bậc 2: ax^2+bx+c=0;
//        //Các biến a,b,c, x1,x2, delta
//        //B1. delta=b^2-4ac;
//        //B2. Kiểm tra deta;
//        //delta<0 phương trình vô nghiệm;
//        // delta==0 phương trình có nghiệm kép x1=x2=-b/2a
//        //delta>0 phương trình có 2 nghiệm
//        // x1= (-b-sqrt(delta)/(2a)
//        // x2 =(-b+sqrt(delta))/(2a)
//        double a, b, c;
//        double delta,x1,x2;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Nhập vào a = ");
//        a = sc.nextInt();
//        System.out.println("Nhập vào b = ");
//        b = sc.nextInt();
//        System.out.println("Nhập vào c = ");
//        c = sc.nextInt();
//        if(a==0){
//            if(b!=0){
//                System.out.println("Phương trình có nghiệm x = "+(-c/b));
//            }else{
//                System.out.println("Phương trình vô nghiệm");
//            }
//        }else{
//            delta = Math.pow(b,2)-4*a*c;
//            if(delta<0){
//                System.out.println("Phương trình vô nghiệm");
//            } else if (delta==0) {
//                x1=x2=-b/(2*a);
//                System.out.println("Phương trình có nghiệm kép x1 = x2 = "+x1);
//            }else {
//                x1=(-b-Math.sqrt(delta))/(2*a);
//                x2=(-b+Math.sqrt(delta))/(2*a);
//                System.out.println("Phương trình có 2 nghiệm x1 = "+x1+ "; x2 = " +x2);
//            }
//
//        }
//    }
//    public static void main(String[] args){
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên từ 0 đến 8");
//        n =sc.nextInt();
//        switch (n){
//            case 2:{
//                System.out.println("Thứ hai");
//                break;
//            }
//            case 3:{
//                System.out.println("Thứ ba");
//                break;
//            }
//            case 4:{
//                System.out.println("Thứ tư");
//                break;
//            }
//            case 5:{
//                System.out.println("Thứ năm");
//                break;
//            }
//            case 6:{
//                System.out.println("Thứ sáu");
//                break;
//            }
//            case 7:{
//                System.out.println("Thứ bảy");
//                break;
//            }
//            case 8:{
//                System.out.println("CN");
//                break;
//            }
//            default:
//                System.out.println("Nhập dữ liệu sai");
//        }
//    }
//public static void main(String[] args){
//    int thang, nam;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Nhập vào tháng: ");
//    thang = sc.nextInt();
//    System.out.println("Nhập vào năm:");
//    nam = sc.nextInt();
//    switch (thang){
//        case 1:
//        case 3:
//        case 5:
//        case 7:
//        case 8:
//        case 10:
//        case 12:
//            System.out.println("Có 31 ngày");
//            break;
//        case 4:
//        case 6:
//        case 9:
//        case 11:
//            System.out.println("Có 30 ngày");
//            break;
//        case 2:
//            if((nam%4==0 && nam%100!=0)||(nam%400==0)){
//                System.out.println("Có 29 ngày");
//            }else{
//                System.out.println("Có 28 ngày");
//            }
//            break;
//
//        default:
//            System.out.println("Nhập dữ liệu sai");
//            break;
//
//    }
//}
//public static void main(String[] args) {
//    for(int i=2;i<=9;i++){
//        for(int j=1;j<=10;j++){
//            System.out.println(i+"x"+j+"="+(i*j));
//        }
//        System.out.println("-------");
//    }
//}
//public static void main(String[] args) {
//    int n=0;
//    Scanner sc = new Scanner(System.in);
//    try {
//        System.out.println("Nhap vao so nguyen n");
//        n = sc.nextInt();
//    }catch (Exception e){
//        System.out.println("Nhập dữ liệu sai");
//    }
//}
//public static void main(String[] args) {
//    double[] mang1;
//    double mang2[];
//}


}
