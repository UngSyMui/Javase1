package session1;

public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x=10;
        System.out.println("x="+x);
        String str = "Hello world";
        if(x>5){
            System.out.println(str);
        }else{
            System.out.println("not found");
        }
        for(int i=0;i<10;i++){
            System.out.println("i="+i);
        }
        Car c = new Car();
        Car c2;
        c2 = new Car();
        c.brand = "Toyota";
        System.out.println(c.brand);
        Car.color="red";
        System.out.println(Car.color);
        c.showInfo();
        c2.showInfo();
        Bike b= new Bike();
        b.run();
        System.out.println(Car.color);
        TamGiac T = new TamGiac();
        T.setCanh1(4);
        T.setCanh2(5);
        T.setCanh3(6);
        System.out.println("Chu Vi = "+T.chuVi());
        System.out.println("Dien Tich = "+T.dienTich());

    }

}
