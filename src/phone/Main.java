package phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> aaa= new ArrayList<>();
        ArrayList<String> bb= new ArrayList<>();
        ArrayList<String> cc= new ArrayList<>();
        ArrayList<String> dd= new ArrayList<>();
        ArrayList<String> ee= new ArrayList<>();
        ee.add("1234");ee.add("2234");ee.add("6666666");
        aaa.add("1234");aaa.add("2234");aaa.add("3333");aaa.add("4444");
        bb.add("1234");bb.add("3456");bb.add("7777");bb.add("555555");bb.add("666666");
        cc.add("22111");cc.add("555666");cc.add("44443333");
        dd.add("abcd");dd.add("22aabb");dd.add("888999");

        PhoneNumber pa = new PhoneNumber("aaaaa ggg",aaa);
        PhoneNumber pb = new PhoneNumber("bbbbbb hhh",bb);
        PhoneNumber pc = new PhoneNumber("ccccc eee",cc);
        PhoneNumber pd = new PhoneNumber("dddddd aaa",dd);
        PhoneNumber pe = new PhoneNumber("aaaaa ggg",ee);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone(pa);
        phoneBook.insertPhone(pb);
        phoneBook.insertPhone(pc);
        System.out.println(phoneBook.phoneList.size());
        phoneBook.insertPhone(pd);
        System.out.println(phoneBook.phoneList.size());
        phoneBook.insertPhone(pe);
        System.out.println(phoneBook.phoneList.size());
        //phoneBook.removePhone("aaaaa GGG");
        System.out.println(phoneBook.phoneList.size());
        phoneBook.searchPhone("ccccc eee");
        phoneBook.searchPhone("hhhhh");
        phoneBook.sort();
        for(int i=0;i<phoneBook.phoneList.size();i++){
            System.out.println(phoneBook.phoneList.get(i).toString());
        }








    }
}
