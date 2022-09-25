package phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        ArrayList<String> bb = new ArrayList<>();
        ArrayList<String> cc = new ArrayList<>();
        ArrayList<String> dd = new ArrayList<>();
        ArrayList<String> ee = new ArrayList<>();
        aa.add("1234");aa.add("2234");aa.add("3333");aa.add("4444");
        bb.add("1111");bb.add("2222");bb.add("5555");
        cc.add("2345");cc.add("7789");cc.add("1122");cc.add("6677");
        dd.add("1010");dd.add("2010");dd.add("3010");dd.add("4010");
        ee.add("1234");ee.add("6565");ee.add("8888");
        PhoneNumber pa = new PhoneNumber("aaa gggg",aa);
        PhoneNumber pb = new PhoneNumber("bbbb hhhh",bb);
        PhoneNumber pc = new PhoneNumber("ccc bbbb",cc);
        PhoneNumber pd = new PhoneNumber("hhh cccc",dd);
        PhoneNumber pe = new PhoneNumber("aaa gggg",ee);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone(pa);
        phoneBook.insertPhone(pb);
        phoneBook.insertPhone(pc);
        System.out.println("Số lượng phần tử: " +phoneBook.phoneList.size());

        phoneBook.insertPhone(pd);
        System.out.println("Số lượng phần tử: " +phoneBook.phoneList.size());

        phoneBook.insertPhone(pe);
        System.out.println("Số lượng phần tử: " +phoneBook.phoneList.size());
        System.out.println(phoneBook.phoneList.toString());
        phoneBook.sort();
        System.out.println(phoneBook.phoneList.toString());
        phoneBook.removePhone("bbbb");

        System.out.println("Số lượng phần tử: " +phoneBook.phoneList.size());
        System.out.println(phoneBook.phoneList.toString());
        phoneBook.searchPhone("bbbb hhhh");







    }
}
